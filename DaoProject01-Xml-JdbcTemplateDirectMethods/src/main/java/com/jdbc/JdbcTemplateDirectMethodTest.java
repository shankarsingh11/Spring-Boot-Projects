package com.jdbc;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.service.EmployeeManagementServiceImpl;

public class JdbcTemplateDirectMethodTest 
{
    public static void main( String[] args )
    {
        
   ClassPathXmlApplicationContext context= 	new ClassPathXmlApplicationContext("com/jdbc/cfg/applicationContext.xml");
   
  
   
   EmployeeManagementServiceImpl service = context.getBean(EmployeeManagementServiceImpl.class);
   
   try {
   
   int count = service.fetchEmplsCount();
   System.out.println("No of employees :: " + count);
   
   System.out.println("=============================");
   
   String emplName = service.fetchEmplNameById(2);
   System.out.println(emplName);
   
   
   System.out.println("=============================");
   
   Map<String,Object> employeeDetails = service.fetchEmployeeByNo(1);
   System.out.println("Employee details::" + employeeDetails);
   
   System.out.println("=============================");
   
   service.getEmployeeDetailsByDesignation("HR","java developer").forEach(System.out::println);
   System.out.println("=============================");
   
   int rowAffected = service.insertEmployeeDetails("Deepa", "Ghaziabad",25000,"PR");
   System.out.println("No of row affected :: " + rowAffected);
   
   int rowUpdated = service.addBonusEmployeeByDesg(10000,"java developer");
   System.out.println("No of row updated :: " + rowUpdated);
   
   }catch(Exception e) {
	   
	   System.out.println("The Exception message is :: " + e.getMessage());
	   
	   e.printStackTrace();
	   
   }
   
   context.close();
    	
    }
}
 