package com.boot.service;

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

}
