package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserRegistrationFormApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context = 	SpringApplication.run(UserRegistrationFormApplication.class, args);
		
	}

}
