package com.boot;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.comp.Employee;


@SpringBootApplication
public class BootProj05ValueAnnotationAppApplication {

	public static void main(String[] args) throws IOException {
		
		ConfigurableApplicationContext context = SpringApplication.run(BootProj05ValueAnnotationAppApplication.class, args);
		
		System.out.println(context);
		
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
