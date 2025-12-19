package com.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.bo.StudentBO;
import com.boot.dao.IStudentMngmntDAO;
import com.boot.dto.StudentDTO;

@Service
public class StudentMngmntServiceImpl implements IStudentMngmntService {

	@Autowired
	private IStudentMngmntDAO dao;
	
	@Override
	public StudentDTO fetchStudentByNo(int no) {
		
		StudentBO bo =  dao.getStudentByNo(no);
		
		 StudentDTO dto = new StudentDTO();
		 BeanUtils.copyProperties(bo, dto);
		 System.out.println(dto);
		 
		 dto.setSrno(1);
		 
		 if(bo.getAvg()>=40) {
			 dto.setGrade("A");
		 }
		 
//		 dto.setSid(bo.getSid());
//		 dto.setSaddress(bo.getSaddress());
//		 dto.setAvg(bo.getAvg());
//		 dto.setSname(bo.getSname());
		
		return dto;
	}

	@Override
	public List<StudentDTO> fetchStudentByName(String name1, String name2) {
		
		List<StudentBO> studentBo = dao.getStudentByName(name1, name2);
		
		List<StudentDTO> studentDto = new ArrayList<>();
		
		for(int i=0;i<studentBo.size();i++){
			
			StudentBO bo = studentBo.get(i);
			StudentDTO dto = new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			
			if(bo.getAvg()>=40){
				dto.setGrade("A");
			}else if(bo.getAvg()>=50){
				dto.setGrade("B");
			}else {
				dto.setGrade("C");
			}
			dto.setSrno(studentDto.size()+1);
			studentDto.add(dto);
		};
		
		return studentDto;
	}

}
