package com.training.pms.model;

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
	private String firsname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	private String city;
	private List<String> patients_assigned;
	private String specialty;
	private int loginid;
}