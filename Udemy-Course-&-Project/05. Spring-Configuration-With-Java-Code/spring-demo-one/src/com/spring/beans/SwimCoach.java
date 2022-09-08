package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;

import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;

public class SwimCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {		
		return "SwimCoach - getDailyWorkout()";
	}

	@Override
	public String getDailyFortune() {
		return "SwimCoach - getDailyFortune()";
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
