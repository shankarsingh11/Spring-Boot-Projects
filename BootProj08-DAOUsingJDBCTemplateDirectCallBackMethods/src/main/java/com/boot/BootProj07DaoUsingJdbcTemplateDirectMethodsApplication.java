package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.dto.StudentDTO;
import com.boot.service.IStudentMngmntService;
import com.boot.service.StudentMngmntServiceImpl;

@SpringBootApplication
public class BootProj07DaoUsingJdbcTemplateDirectMethodsApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(BootProj07DaoUsingJdbcTemplateDirectMethodsApplication.class, args);
		
		IStudentMngmntService service = context.getBean(IStudentMngmntService.class);
		
		StudentDTO student = service.fetchStudentByNo(2);
		
		System.out.println(student);
		
		context.close();
		
	}

}
