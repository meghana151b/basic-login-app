package com.authetication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
	@GetMapping("/")
	public String indexPage() {
		return "index.html";
	}

	@GetMapping("/loginPage")
	public String loginPage() {
		return "login.html";
	}
	@GetMapping("/signUpPage")
	public String signUpPage() {
		return "signUp.html";
	}
	

}
