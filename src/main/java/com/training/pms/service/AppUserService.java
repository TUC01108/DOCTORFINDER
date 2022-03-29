package com.training.pms.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.training.pms.dao.UserDAO;
import com.training.pms.model.AppUser;
import com.training.pms.model.ConfirmationToken;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService {
	
	private final static String USER_NOT_FOUND_MSG = "user with email %s not found";
	private final UserDAO userDAO;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	private final ConfirmationTokenServiceImpl confirmationTokenServiceImpl;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userDAO.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
	}
	
	public String signUpUser(AppUser appUser) {
		boolean userExists = userDAO.findByEmail(appUser.getEmail()).isPresent();
		
		if(userExists) {
			// TODO check if attributes are the same
			// TODO if email not confirmed send confirmation email
			
			throw new IllegalStateException("email already taken");
		}
		String encodedPassword = bCryptPasswordEncoder.encode(appUser.getPassword());
		
		appUser.setPassword(encodedPassword);
		
		userDAO.save(appUser);
		
		String token = UUID.randomUUID().toString();
				
		ConfirmationToken confirmationToken = new ConfirmationToken(
				token,
				LocalDateTime.now(),
				LocalDateTime.now().plusMinutes(15),
				appUser
				);
				
		confirmationTokenServiceImpl.saveConfirmationToken(confirmationToken);
		
		//TODO: Send email
		
		return token;
	}
	
	 public int enableAppUser(String email) {
	        return userDAO.enableAppUser(email);
	    }

}
