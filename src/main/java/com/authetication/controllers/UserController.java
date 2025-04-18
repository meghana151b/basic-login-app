package com.authetication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.authetication.services.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService service;

}
