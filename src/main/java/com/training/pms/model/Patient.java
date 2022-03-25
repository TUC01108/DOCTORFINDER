package com.training.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "patient")
public class Patient {
	@Id
	private int patientId;
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private String city;
	private String symptom;
	private String doctorAssigned;
	private int billAmount;
	private int loginId;
}