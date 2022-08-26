package com.javatpoint.server.main.filtering;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@RequestMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("TestName", "9999999999", "59000");
	}
}
