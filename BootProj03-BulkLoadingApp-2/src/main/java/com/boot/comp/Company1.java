package com.boot.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my.info")
public class Company1 {
	
	private String name;
	private String location;
	private Integer size;
	
	
	static {
		System.out.println("Company1.class file is loading...");
	}
	
	public Company1() {
		System.out.println("Company1:: Zero param constructor....");
		
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
		return "Company1 [name=" + name + ", location=" + location + ", size=" + size + "]";
	}
	
	

}
