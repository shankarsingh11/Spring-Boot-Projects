package com.user.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class User {
	
	@Id
	private String id;
	private String FirstName;
	private String LastName;
	@Indexed(unique=true)
	private String Email_Address;
	@Indexed(unique=true)
	private double Phone_Number;
	@Indexed(unique=true)
	private String username;
	private String dob;

}
