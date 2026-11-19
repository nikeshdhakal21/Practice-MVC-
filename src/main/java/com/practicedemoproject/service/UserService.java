package com.practicedemoproject.service;

import org.springframework.stereotype.Component;

import com.practicedemoproject.model.User;

@Component
public interface UserService  {
	
	void signup(User u);
	User login(String un ,String psw);
	

}
