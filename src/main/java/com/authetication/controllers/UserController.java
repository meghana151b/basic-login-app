package com.authetication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.authetication.entities.User;
import com.authetication.services.UserService;



@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/signUpPage")
	public String addUser(@ModelAttribute User user) {
	 boolean status=service.usernameExists(user.getUsername());
	 if(status==false) {
		 service.addUser(user);
	 }
	 else {
		 System.out.println("Username already exists");
	 }
	
	return "login";
	}
	@PostMapping("/loginPage")
	public String validateUser(@RequestParam String username,@RequestParam String password) {
	boolean status=service.validateUser(username,password);
	if(status==true) {
		return "home";
	}
	else {
		return "login";
	}
	}
}
