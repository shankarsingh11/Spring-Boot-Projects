package com.jdbc.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeManagementService {
	
	public int fetchEmplsCount();
	public String fetchEmplNameById(int id);
	public Map<String,Object> fetchEmployeeByNo(int no);
	public List<Map<String,Object>> getEmployeeDetailsByDesignation(String desg1,String desg2);
	public int insertEmployeeDetails(String name,String address,int salary,String desg);
    public int addBonusEmployeeByDesg(int salary,String desg);

}
