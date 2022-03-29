package com.training.pms.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "patient")
public class Patient implements UserDetails {
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
	private Boolean locked = false;
	private Boolean enabled = false;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return !locked;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}
	public Patient(String name, String email, String password, String city, String symptom, String doctorAssigned,
			int billAmount, int loginId, Boolean locked, Boolean enabled) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.symptom = symptom;
		this.doctorAssigned = doctorAssigned;
		this.billAmount = billAmount;
		this.loginId = loginId;
		this.locked = locked;
		this.enabled = enabled;
	}
	public Patient(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	
	
}