package com.training.pms.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="doctor")
public class Doctor {
	
	@Id
	private int doctorid;
	private String name;
	private String email;
	private String password;
	private String city;
	private ArrayList<String> patientsAssigned;
	private String specialty;
	private int loginid;
}