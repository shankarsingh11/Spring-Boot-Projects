package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.comp.Company;

@SpringBootApplication
public class BootProj05SpringBootBulkLoadingAppApplication {

	public static void main(String[] args) {
		
		
	ConfigurableApplicationContext context =	SpringApplication.run(BootProj05SpringBootBulkLoadingAppApplication.class, args);
		
	Company company =context.getBean(Company.class);
	
	System.out.println(company);
	
	context.close();
		
	}

}
