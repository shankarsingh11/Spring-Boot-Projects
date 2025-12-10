package com.boot;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.comp.Company1;
import com.boot.comp.Company2;
import com.boot.comp.Company3;

@SpringBootApplication
public class BootProj05BulkLoadingApp2Application {

	public static void main(String[] args) throws IOException {
		
		ConfigurableApplicationContext context = SpringApplication.run(BootProj05BulkLoadingApp2Application.class, args);
	
	    System.out.println(context);
	    
	    
	    Company1 company1 = context.getBean(Company1.class);
	    System.out.println(company1);
	    
	    System.in.read();
	    
	    Company2 company2 = context.getBean(Company2.class);
	    System.out.println(company2);
	    
	    System.out.println();
	    
	    Company3  company3 = context.getBean(Company3.class);
	    System.out.println(company3);
	
	}

}
