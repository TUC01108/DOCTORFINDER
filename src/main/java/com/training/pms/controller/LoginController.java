package com.training.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.service.LoginService;

@RestController
@RequestMapping("login")
@CrossOrigin(origins ="http://localhost:4200")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping
	public String getLogins() {
		return "Getting all the logins";
	}

}
