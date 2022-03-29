package com.training.pms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.pms.model.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Override
	public List<Appointment> getAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return "it works for appointments";
	}

	@Override
	public boolean isAppointmentExists(int appointmentid) {
		// TODO Auto-generated method stub
		return false;
	}

}
