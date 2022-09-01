package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.interfaces.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// load the spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// retrieve beans from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// EXAMPLE FOR manual bean configuration 
		Coach swimCoach = context.getBean("swimCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());

		// close context
		context.close();
	}

}
