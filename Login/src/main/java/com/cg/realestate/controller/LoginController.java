package com.cg.realestate.controller;

import java.util.Iterator;
import java.util.List;

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
		
		List<User> users = proxy.display();
		
		for ( User user : users){

			if(user.getEmailId().equals(emailId) && user.getPassword().equals(password)){
				return "Login Successful";
			}

		}
	    return "Invalid Login";	
	}
}
