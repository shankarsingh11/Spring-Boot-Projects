package com.jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements IEmployeeDao {

	private JdbcTemplate jdbcTemplate;
	private static final String SQL_SELECT_QUERY="Select count(*) from employee";
	private static final String SQL_SELECT_QUERY_By_Id="Select ename from employee where eId = ?";
	private static final String SQL_SELECT_QUERY_By_No="Select eId, ename, eaddress,salary,desg from employee where eId = ?";
	private static final String SQL_SELECT_QUERY_By_DESG="Select eId, ename, eaddress, salary, desg from employee where desg in (?,?) order by salary";
	private static final String INSERT_EMPLOYEE="Insert into employee(`ename`,`eaddress`,`salary`,`desg`) values(?,?,?,?)";
	private static final String ADD_BONUS_BY_DESG="update employee Set salary = salary+? where desg=?";
	
	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int getEmplysCount() {
		
	System.out.println(jdbcTemplate);
		
		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY,Integer.class);
	}


	@Override
	public String getEmplNameById(int id) {
		
		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY_By_Id, String.class,id);
	}


	@Override
	public Map<String, Object> getEmployeeByNo(int no) {
		
		Map<String,Object> map=  jdbcTemplate.queryForMap(SQL_SELECT_QUERY_By_No,no);
		
		return map;
	}


	@Override
	public List<Map<String, Object>> getEmployeeDetailsByDesignation(String desg1, String desg2) {
		
		List<Map<String,Object>> list = jdbcTemplate.queryForList(SQL_SELECT_QUERY_By_DESG,desg1,desg2);
		return list ;
	}




	@Override
	public int addBonusEmployeeByDesg(int salary,String desg) {
		
		return jdbcTemplate.update(ADD_BONUS_BY_DESG,salary,desg);
	}


	@Override
	public int insertEmployee(String name, String address, int salary, String desg) {
		
		return jdbcTemplate.update(INSERT_EMPLOYEE,name,address,salary,desg);
	}

}
