package com.training.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "dflogin")
public class Login {
	
	@Id
	private int loginid;
	private String Username;
	private String password;

}
