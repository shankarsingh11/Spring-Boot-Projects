package com.jdbc.service;

import java.util.List;
import java.util.Map;

import com.jdbc.dao.IEmployeeDao;

public class EmployeeManagementServiceImpl implements IEmployeeManagementService {

	private IEmployeeDao dao;

	public EmployeeManagementServiceImpl(IEmployeeDao dao) {
		super();
		this.dao = dao;
	}


	@Override
	public int fetchEmplsCount() {
		System.out.println("Dao Name is : " + dao.getClass().getName());
		return dao.getEmplysCount();
	}
	

	@Override
	public String toString() {
		return "EmployeeManagementServiceImpl [dao=" + dao + "]";
	}


	@Override
	public String fetchEmplNameById(int id) {
		
		return dao.getEmplNameById(id);
	}


	@Override
	public Map<String, Object> fetchEmployeeByNo(int no) {
		
		return dao.getEmployeeByNo(no);
	}


	@Override
	public List<Map<String, Object>> getEmployeeDetailsByDesignation(String desg1, String desg2) {
		
		List<Map<String,Object>> list = dao.getEmployeeDetailsByDesignation(desg1, desg2);
		
		return list;
	}



	@Override
	public int addBonusEmployeeByDesg(int salary,String desg ) {
		
		return dao.addBonusEmployeeByDesg(salary,desg);
	}


	@Override
	public int insertEmployeeDetails(String name, String address, int salary, String desg) {
		
		return dao.insertEmployee(name, address, salary, desg);
	}
	

}
