package com.cg.realestate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SearchPropertyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchPropertyApplication.class, args);
	}

}
