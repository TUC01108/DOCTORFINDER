package com.training.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.pms.dao.AppointmentDAO;
import com.training.pms.model.Appointment;
import com.training.pms.model.Login;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	AppointmentDAO appointmentDAO;

	@Override
	public List<Appointment> getAppointments() {
		return (List<Appointment>) appointmentDAO.findAll();
	}

	@Override
	public String addAppointment(Appointment appointment) {
		appointmentDAO.save(appointment);
		return "it works for appointments";
	}

	@Override
	public boolean isAppointmentExists(int appointmentid) {
		// TODO Auto-generated method stub
		return false;
	}

}
