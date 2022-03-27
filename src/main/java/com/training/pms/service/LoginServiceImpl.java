package com.training.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.pms.dao.LoginDAO;
import com.training.pms.model.Doctor;
import com.training.pms.model.Login;
import com.training.pms.model.Patient;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDAO loginDAO;

	@Override
	public String validatePatient(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validateDoctor(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLoginExists(int loginId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String deleteLogins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Login> getLogins() {
		return (List<Login>) loginDAO.findAll();
	}

	@Override
	public String addLogin(Login login) {
		loginDAO.save(login);
		return "Login saved successfully";
	}

	

}
