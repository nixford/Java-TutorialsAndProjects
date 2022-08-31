package com.spring.demo.beans;

import com.spring.demo.interfaces.Coach;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "TrackCoach - getDailyWorkout";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
