package com.training.pms.service;

import com.training.pms.model.Patient;

public interface LoginService {
	
	public String validatePatient(String username, String password);
	public String registerPatient(Patient patient);
	
	public String validateDoctor(String username, String password);
	public String registerDoctor(Doctor doctor);
	
	public boolean isLoginExists(int loginId);
	
	
	// delete all logins
	public String deleteLogins();
	
}
