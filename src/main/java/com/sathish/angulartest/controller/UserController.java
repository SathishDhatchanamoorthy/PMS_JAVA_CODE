package com.sathish.angulartest.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.angulartest.entity.AuthRequest;
import com.sathish.angulartest.entity.UserMaster;
import com.sathish.angulartest.entity.UserResponse;
import com.sathish.angulartest.repository.UserRepository;

@CrossOrigin
@RestController
public class UserController {

	private static final Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	private UserRepository ur;



	@PostMapping("/signin")
	public UserResponse signin(@RequestBody AuthRequest authRequest) {
		System.err.println("checking");
		return new UserResponse(1,"Login Success","",true);
	}

	@PostMapping("/signup")
	public UserResponse signup(@RequestBody UserMaster user) {
		ur.save(user);
		return new UserResponse(1,"Signup Success",user,true);
	}

}
