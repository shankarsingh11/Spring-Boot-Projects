package com.boot.service;

import java.util.List;

import com.boot.dto.StudentDTO;

public interface IStudentMngmntService {
	
	public  StudentDTO fetchStudentByNo(int no);
	public List<StudentDTO> fetchStudentByName(String name1,String name2);

}
