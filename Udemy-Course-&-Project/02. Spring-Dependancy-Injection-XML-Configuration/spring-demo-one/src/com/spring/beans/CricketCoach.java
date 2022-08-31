package com.spring.beans;

import com.spring.interfaces.Coach;
import com.spring.interfaces.Fortune;

public class CricketCoach implements Coach {
	
	private String className = getClass().getName();
	// define a private field for the dependency
	private Fortune fortuneService;
	
	public CricketCoach(Fortune theFortuneService) {
		System.out.println("CricketCoach constructor");
	}

	// EXAMPLE FOR DEPENDENCY INJECTION WITH SETTER
	public void setFortuneService(Fortune fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "CricketCoach - getDailyWorkout";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune(className);
	}

}
