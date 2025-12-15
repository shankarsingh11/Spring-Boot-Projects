package com.boot.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class Company3 {
	
	@Value("${user.info.name}")
	private String name;
	@Value("${user.info.location}")
	private String location;
	@Value("${user.info.size}")
	private Integer size;
	
	
	static {
		System.out.println("Company3.class file is loading...");
	}
	
	public Company3() {
		System.out.println("Company3:: Zero param constructor....");
		
	}

	@Override
	public String toString() {
		return "Company3 [name=" + name + ", location=" + location + ", size=" + size + "]";
	}
	
	

}
