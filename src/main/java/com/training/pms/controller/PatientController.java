package com.training.pms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.model.Patient;

@RestController
@RequestMapping("patient")
public class PatientController {
	
	private static final List<Patient> PATIENT = Arrays.asList(
			new Patient("James Bond","jb@gmail.com","password"),
			new Patient("Maria Jones","mj@gmail.com","rootroot")
			);
	
	@GetMapping(path ="{patientid}")
	public Patient getPatient(@PathVariable("patientid") Integer patientid) {
		return PATIENT.stream().filter(patient -> patientid.equals(patient.getPatientId())).findFirst().orElseThrow
				(() -> new IllegalStateException("Patient "+patientid+" does not exist"));
	}

}
