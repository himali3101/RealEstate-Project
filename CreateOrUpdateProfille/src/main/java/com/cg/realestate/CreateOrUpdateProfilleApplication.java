package com.cg.realestate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class CreateOrUpdateProfilleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateOrUpdateProfilleApplication.class, args);
	}

}
