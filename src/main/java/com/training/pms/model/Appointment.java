package com.training.pms.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	private int appointmentid;
	private Date date;
	private String symptom;
	private int patientid;
	private int doctorid;

}
