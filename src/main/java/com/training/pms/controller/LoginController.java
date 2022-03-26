package com.training.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.model.Login;
import com.training.pms.service.LoginService;

@RestController
@RequestMapping("login")
@CrossOrigin(origins ="http://localhost:60944/")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping
	public ResponseEntity<List<Login>> getLogins() {			//localhost:5050/product		-GET
		ResponseEntity<List<Login>> responseEntity = null;
		List<Login> result = null;
		if(loginService.getLogins().equals(null)) {
			result = loginService.getLogins();
			responseEntity = new ResponseEntity<List<Login>>(result, HttpStatus.NO_CONTENT);
		} else {
			result = loginService.getLogins();
			responseEntity = new ResponseEntity<List<Login>>(result, HttpStatus.OK);
		}
		return responseEntity;
		// return "Getting all the logins";
	}

}
