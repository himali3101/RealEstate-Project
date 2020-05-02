package com.cg.realestate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class searchController {

	@GetMapping(path = "/searchbyid")
	public String searchById() {
		
		return "search by id";
	}
	
	@GetMapping(path = "/searchbylocation")
	public String searchByLocation() {
		
		return "search by location";
	}
	
	@GetMapping(path = "/searchbytype")
	public String searchByType() {
		
		return "search by type";
	}
	
	@GetMapping(path = "/searchbybudget")
	public String searchByBudget() {
		
		return "search by budget";
	}
}
