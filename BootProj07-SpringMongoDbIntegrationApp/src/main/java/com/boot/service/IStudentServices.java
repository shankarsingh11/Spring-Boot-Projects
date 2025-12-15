package com.boot.service;

import java.util.List;

import com.boot.comp.Student;

public interface IStudentServices {
	
	public List<Student> findAllStudent();
	public Student saveStudent(Student student);
	public Student getStudentById(String id);
	public Student updateStudent(String id,Student updatedStudent);
	public String deleteStudent(String id);

}
