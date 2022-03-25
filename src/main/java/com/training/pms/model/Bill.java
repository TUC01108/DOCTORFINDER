package com.training.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bill")
public class Bill {
	
	@Id
	private int billid;
	private int billAmount;
	private int patientid;
	private int doctorid;
	

}
