package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	// define default constructor
	public TennisCoach() {
		System.out.println("TennisCoach - constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoach - getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return "TennisCoach - getDailyFortune() - " + fortuneService.getFortune();
	}
}
