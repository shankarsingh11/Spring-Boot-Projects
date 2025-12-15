package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.comp.Student;
import com.boot.repository.StudentRepository;
import com.boot.service.StudentServicesImpl;

@RestController
public class MainController {
	
	@Autowired
	StudentRepository studentRepo;
	@Autowired
	StudentServicesImpl stdServices;
	
@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
	
	studentRepo.save(student);
		
	}

@GetMapping("/fetchStudent")
public List<Student> fetchStudent(){
	
	return studentRepo.findAll();
	
}


@DeleteMapping("/deleteStudent/{id}")
public String deleteStudentById(String id) {
	
	return stdServices.deleteStudent(id);
	
}
	

}
