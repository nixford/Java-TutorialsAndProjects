package com.spring.demo.beans;

import com.spring.demo.interfaces.Coach;
import com.spring.demo.interfaces.Fortune;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private Fortune fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(Fortune theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "BaseballCoach - getDailyWorkout";
	}

	@Override
	public String getFortune() {		
		// use my fortuneService to get a fortune		
		return fortuneService.getFortune();
	}
}
