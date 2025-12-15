package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.boot.comp.Student;
import com.boot.repository.StudentRepository;

public class StudentServicesImpl implements IStudentServices {

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public List<Student> findAllStudent() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(String id,Student updatedStudent) {
		
		Student existing = studentRepo.findById(id).orElse(null);
		
		if(existing == null) {
			return null;
		}
		
		existing.set_id(updatedStudent.get_id());
		existing.setSid(updatedStudent.getSid());
		existing.setSname(updatedStudent.getSname());
		existing.setSaddress(updatedStudent.getSaddress());
		
		return studentRepo.save(existing);
		
	}

	@Override
	public String deleteStudent(String id) {
		
		Student std =  studentRepo.findById(id).orElse(null);
		
		if(std==null) {
			return "student not exist for this id :: " + id ;
		}
		
		studentRepo.deleteById(id);
		
		return "Student Deleted Successfully....";
	}

	@Override
	public Student getStudentById(String id) {
		
		return studentRepo.findById(id).orElse(null);
	}

}
