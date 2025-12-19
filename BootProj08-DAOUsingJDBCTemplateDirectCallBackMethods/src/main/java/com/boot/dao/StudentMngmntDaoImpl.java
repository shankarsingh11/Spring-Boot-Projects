package com.boot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.boot.bo.StudentBO;

@Repository
public class StudentMngmntDaoImpl implements IStudentMngmntDAO {
	
	private static final String GET_STUDENT_BY_NO = "SELECT SID, SADDRESS,AVG,SNAME FROM STUDENT WHERE SID=?";

	private static final String GET_STUDENT_BY_NAME = "Select SID,SADDRESS,AVG,SNAME FROM STUDENT WHERE SNAME in (?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public StudentBO getStudentByNo(int no) {
		StudentBO bo = null;
		bo =  jdbcTemplate.queryForObject(GET_STUDENT_BY_NO, new StudentMapper(),no);
		System.out.println(bo);
		return bo;
	}
	
	private static class StudentMapper implements RowMapper<StudentBO> {

	    @Override
	    public StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
	        System.out.println("StudentMngmntDaoImpl.StudentMapper.mapRow()");
	        StudentBO bo = new StudentBO(); 
	        
	        bo.setSid(rs.getInt(1));
	        bo.setSaddress(rs.getString(2));
	        bo.setAvg(rs.getFloat(3));
	        bo.setSname(rs.getString(4));

	        return bo;
	    }
	}

	@Override
	public List<StudentBO> getStudentByName(String name1, String name2) {
	 return jdbcTemplate.query(GET_STUDENT_BY_NAME, new StudentRowMapper(),name1,name2);
		
	}
	
	private static final class  StudentRowMapper implements RowMapper<StudentBO>{
		
		@Override
		public StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("StudentMngmntDaoImpl.StudentRowMapper.mapRow()");
			StudentBO bo = new StudentBO();
			bo.setSid(rs.getInt(1));
			bo.setSaddress(rs.getString(2));
			bo.setAvg(rs.getFloat(3));
			bo.setSname(rs.getString(4));
			return bo;
		}
		
	}

}
