package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.SwimCoach;
import com.spring.interfaces.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// load the spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// retrieve beans from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// EXAMPLE FOR manual bean configuration 
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());

		// close context
		context.close();
	}

}
