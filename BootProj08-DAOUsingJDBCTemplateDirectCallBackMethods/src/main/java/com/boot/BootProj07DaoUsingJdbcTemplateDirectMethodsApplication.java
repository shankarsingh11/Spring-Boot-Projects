package com.boot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.dto.StudentDTO;
import com.boot.service.IStudentMngmntService;

@SpringBootApplication
public class BootProj07DaoUsingJdbcTemplateDirectMethodsApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(BootProj07DaoUsingJdbcTemplateDirectMethodsApplication.class, args);
		IStudentMngmntService service = context.getBean(IStudentMngmntService.class);
		
		StudentDTO student = service.fetchStudentByNo(2);
		System.out.println(student);
		System.out.println("===============================================");
		List<StudentDTO> listdto = service.fetchStudentByName("kuldeep", "Deep");
		listdto.forEach(System.out::println);
		
		
		context.close();
		
	}

}
