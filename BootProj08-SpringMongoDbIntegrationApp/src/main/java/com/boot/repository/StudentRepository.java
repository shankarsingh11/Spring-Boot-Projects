package com.boot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.boot.comp.Student;

public interface StudentRepository extends MongoRepository<Student,String> {
	
	

}
