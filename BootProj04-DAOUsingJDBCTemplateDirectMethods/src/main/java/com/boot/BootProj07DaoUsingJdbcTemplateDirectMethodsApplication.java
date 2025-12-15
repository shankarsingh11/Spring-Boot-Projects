package com.boot;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.service.EmployeeManagementServiceImpl;

@SpringBootApplication
public class BootProj07DaoUsingJdbcTemplateDirectMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootProj07DaoUsingJdbcTemplateDirectMethodsApplication.class, args);
		EmployeeManagementServiceImpl service =	context.getBean(EmployeeManagementServiceImpl.class);
		List<Map<String,Object>>  emplRecords = service.getEmployeeDetailsByDesignation("java developer", "HR");
		emplRecords.forEach(System.out::println);
		
		context.close();
		
	}

}
