package com.spring.beans;

import com.spring.interfaces.Coach;
import com.spring.interfaces.Fortune;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;

	private String className = getClass().getName();
	// define a private field for the dependency
	private Fortune fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach constructor");
	}

	// EXAMPLE FOR DEPENDENCY INJECTION WITH SETTER
	public void setFortuneService(Fortune fortuneService) {
		System.out.println("CricketCoach setter");
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
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
