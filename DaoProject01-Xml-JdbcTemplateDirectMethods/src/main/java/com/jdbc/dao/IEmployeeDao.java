package com.jdbc.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDao {
	public int getEmplysCount();
	public String getEmplNameById(int id);
	public Map<String,Object> getEmployeeByNo(int no);
	public List<Map<String,Object>> getEmployeeDetailsByDesignation(String desg1,String desg2);
	public int insertEmployee(String name,String address,int salary,String desg);
	 public int addBonusEmployeeByDesg(int salary,String desg);
	
}
