package com.practicedemoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practicedemoproject.model.User;
import com.practicedemoproject.service.UserService;



@Controller
public class UserController {
	@Autowired
	private UserService usrService;
	
	@GetMapping({"/","/login"})
	public String getLogin() {
		return "LoginForm";
		
	}
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User usr,Model model) {
		
		User u = usrService.login (usr.getUserName(),usr.getPassword());
		if(u != null) {
			model.addAttribute("uname", u.getFname());
			return "Home";
		}
		model.addAttribute("message", "user not found");
		return "LoginForm";
		
		
	}
	
	
	@GetMapping("/signup")
	public String getSignup() {
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User usr) {
		usrService.signup(usr);
		return "LoginForm";
	}

}
