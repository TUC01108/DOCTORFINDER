package com.training.pms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {
	@SequenceGenerator(name="patient_sequence",
			sequenceName= "patient_sequence",
			allocationSize = 1)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "patient_sequence"
			)
	private int patientId;
	
	private String name;
	private String email;
	private String password;
	private String city;
	private String symptom;
	private String doctorAssigned;
	private int billAmount;
	private int loginId;
}