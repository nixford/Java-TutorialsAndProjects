package com.javatpoint.server.main.helloworld;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class HelloWorldController {

	// using get method and hello-world as URI
	// It can be used also @GetMapping - in this case method specification is not
	// required (only path)
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}

	// Changing the Hello World Service to Return a Bean
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean!");
	}

	@GetMapping(path = "/path/{name}")
	public HelloWorldBean pathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hellow World Path, %s", name));
	}
}
