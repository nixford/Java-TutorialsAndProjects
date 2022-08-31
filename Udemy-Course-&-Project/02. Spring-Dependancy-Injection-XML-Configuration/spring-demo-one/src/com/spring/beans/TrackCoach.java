package com.spring.beans;

import com.spring.interfaces.Coach;
import com.spring.interfaces.Fortune;

public class TrackCoach implements Coach {

	private String className = getClass().getName();

	// define a private field for the dependency
	private Fortune fortuneService;

	// define a default empty constructor in order the object to be instantiated in MyAppHardCoded.java
	public TrackCoach() {
	}

	// EXAMPLE FOR CONSTRUCTOR INJECTION
	// define a constructor for dependency injection
	public TrackCoach(Fortune theFortuneService) {
		System.out.println("TrackCoach constructor");
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TrackCoach - getDailyWorkout";
	}

	@Override
	public String getFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune(className);
	}
}
