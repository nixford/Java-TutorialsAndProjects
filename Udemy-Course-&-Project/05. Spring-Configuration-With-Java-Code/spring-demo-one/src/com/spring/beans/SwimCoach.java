package com.spring.beans;

import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;

public class SwimCoach implements Coach {
	
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

}
