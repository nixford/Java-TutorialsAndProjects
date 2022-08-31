package com.spring.demo;

import com.spring.demo.beans.TrackCoach;
import com.spring.demo.interfaces.Coach;

public class MyAppHardCoded {

	public static void main(String[] args) {
		
		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
