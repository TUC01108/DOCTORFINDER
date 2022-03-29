package com.training.pms.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.model.RegistrationRequest;
import com.training.pms.service.RegistrationServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "registration")
@CrossOrigin(origins ="http://localhost:4200")
@AllArgsConstructor
public class RegistrationController {
	
	private final RegistrationServiceImpl registrationServiceImpl;
	
	@PostMapping
	public String register(@RequestBody RegistrationRequest request) {
		return registrationServiceImpl.register(request);
	}
	
	@GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationServiceImpl.confirmToken(token);
    }

}
