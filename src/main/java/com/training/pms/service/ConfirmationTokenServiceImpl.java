package com.training.pms.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.training.pms.dao.ConfirmationTokenDAO;
import com.training.pms.model.ConfirmationToken;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ConfirmationTokenServiceImpl {
	
	private final ConfirmationTokenDAO confirmationTokenDAO;
	
	public void saveConfirmationToken(ConfirmationToken token) {
		confirmationTokenDAO.save(token);
	}
	
	public Optional<ConfirmationToken> getToken(String token) {
        return confirmationTokenDAO.findByToken(token);
    }

    public int setConfirmedAt(String token) {
        return confirmationTokenDAO.updateConfirmedAt(
                token, LocalDateTime.now());
    }
}
