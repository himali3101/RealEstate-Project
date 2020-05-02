package com.cg.realestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.realestate.model.User;

@RestController
public class LoginController {

	@Autowired
	LoginProxy proxy;
	
	@GetMapping(path = "/login/{emailId}/{password}")
	public String login(@PathVariable String emailId, @PathVariable String password ) {
		
		User user = proxy.findByEmailId(emailId);
		if( user.getEmailId().equals(emailId) && user.getPassword().equals(password)) {
			return "Login Successful";
		}
		else {
			return "Invalide Login";
		}
		
	}
}
