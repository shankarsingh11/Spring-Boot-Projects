package com.user.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.UserRegisterRequest;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@PostMapping("/register")
	public String userRegistration(@RequestBody UserRegisterRequest request) {
		
		return null;
	}
	
}
	


