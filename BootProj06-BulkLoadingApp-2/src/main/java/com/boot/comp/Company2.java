package com.boot.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="org.info")
public class Company2 {
	
	@Value("${user.info.name}")
	private String name;
	@Value("${user.info.location}")
	private String location;
	@Value("${user.info.size}")
	private Integer size;
	
	
	static {
		System.out.println("Company2.class file is loading...");
	}
	
	public Company2() {
		System.out.println("Company2:: Zero param constructor....");
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "Company2 [name=" + name + ", location=" + location + ", size=" + size + "]";
	}
	
	

}
