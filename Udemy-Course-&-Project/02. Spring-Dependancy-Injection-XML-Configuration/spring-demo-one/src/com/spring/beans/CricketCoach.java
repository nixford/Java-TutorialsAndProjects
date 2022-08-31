package com.spring.beans;

import com.spring.interfaces.Coach;
import com.spring.interfaces.Fortune;

public class CricketCoach implements Coach {
	
	private String className = getClass().getName();
	private Fortune fortuneService;
	
	public CricketCoach(Fortune theFortuneService) {
		fortuneService = theFortuneService;
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
