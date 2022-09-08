package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}	
	
	// controller method to PROCESS the form 
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// add new method to read form from data
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String sayHi(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String studentName = request.getParameter("studentName");
		
		// convert the data to all caps
		studentName.toUpperCase();
		
		// create message
		String result = "Hi " + studentName; 
		
		// add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
