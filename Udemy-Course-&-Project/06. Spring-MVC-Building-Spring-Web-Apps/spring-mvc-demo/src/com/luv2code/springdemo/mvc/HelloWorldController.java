package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// controller method to show the initial form
	@RequestMapping
	public String showForm() {
		return "helloworld-form";
	}	
	
	// controller method to PROCESS the form 
	public String processForm() {
		return "";
	}
}