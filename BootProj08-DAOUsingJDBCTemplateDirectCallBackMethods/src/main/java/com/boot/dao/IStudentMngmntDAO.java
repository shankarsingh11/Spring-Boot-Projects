package com.boot.dao;

import java.util.List;

import com.boot.bo.StudentBO;

public interface IStudentMngmntDAO {
	
	public StudentBO getStudentByNo(int no);
	public List<StudentBO> getStudentByName(String name1,String name2);

}
