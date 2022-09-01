package com.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.interfaces.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve beans from spring container
		// If id is specified in @Component("myCoach") - then getBean("myCoach", Coach.class)
		// If @Component - getBean("... class name with lower case first letter", Coach.class
		Coach theCoach = context.getBean("tennisCoach", Coach.class);		
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();
	}

}
