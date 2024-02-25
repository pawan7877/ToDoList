package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return"login";
	}
    
	@RequestMapping("/login")
	public String login() {
		return"login";
	}

	@RequestMapping("/registration")
	public String regi() {
		return"registration";
	}
	
   @RequestMapping("/Todopage")
   public String note() {
	return"Todopage";
	}
   @RequestMapping("/AdminPannel")
   public String admin() {
	return"AdminPannel";
	}
   
   @RequestMapping("/adminLogin")
   public String loginadmin() {
	return"adminLogin";
	}
   
   @RequestMapping("/TodoList")
   public String listTodo() {
	return"TodoList";
	}
}
