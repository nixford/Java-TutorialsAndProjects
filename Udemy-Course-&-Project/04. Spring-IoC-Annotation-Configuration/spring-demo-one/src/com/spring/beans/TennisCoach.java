package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;

// In case we specify "myCoach" as parameter - @Component("myCoach") 
// this class will be registered as bean and "myCoach" is set as id value in Spring container

// In case we do not specify it - @Component, 
// the id will be class name with lower case letter - tennisCoach

@Component
public class TennisCoach implements Coach {

	// I. EXAMPLE FOR FIELD INJECTION
	@Autowired
	private FortuneService fortuneService;

	// define default constructor
	public TennisCoach() {
		System.out.println("TennisCoach - constructor");
	}

	// II. Dependency injection with @Autowired in CONSTRUCTOR
	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */

	// III. Dependency injection with @Autowired in SETTER
	// @Autowired
	// public void setFortuneService(FortuneService theFortuneService) {
	// System.out.println("TennisCoach - setFortuneService");
	// fortuneService = theFortuneService;
	// }

	@Override
	public String getDailyWorkout() {
		return "TennisCoach - getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return "TennisCoach - getDailyFortune() - " + fortuneService.getFortune();
	}
}
