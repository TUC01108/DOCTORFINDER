package com.training.pms.service;

import java.util.List;

import com.training.pms.model.Doctor;

public interface DoctorService {

	public String addDoctor(Doctor doctor);
	public List<Doctor> getDoctors();
	
	
	public String updateDoctor(int doctorid,Doctor doctor);
	public String deleteDoctor(int doctorid);
	
	public Doctor getDoctor(int doctorid);
	public boolean doesDoctorExist(int doctorid);
	public boolean deleteDoctor();
	
	public List<Doctor> getDoctorByName(String doctorname);
	public List<Doctor> getDoctorBySpecailty(String specialty);
}