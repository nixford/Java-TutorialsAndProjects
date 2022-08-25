package com.javatpoint.server.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

		// using get method and hello-world as URI
		// It can be used also @GetMapping - in this case method specification is not required (only path)
		@RequestMapping(method=RequestMethod.GET, path="/hello-world")
		public String helloWorld() {
			return "Hello World!";
		}
		
		//Changing the Hello World Service to Return a Bean
		@GetMapping(path="/hello-world-bean")
		public HelloWorldBean helloWorldBean() {
			return new HelloWorldBean("Hello World Bean!");
		}
}
