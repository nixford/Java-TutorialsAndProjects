package com.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.interfaces.Coach;

public class MyAppConfiguredWithXML {

	public static void main(String[] args) {
		
		// EXAMPLE FOR IoC and CONSTRUCTOR DI with XML Configuration of SPRING CONTAINER and with primary functions:
		//		1) Create and manage objects (Inversion of Control)	
		//		2) Inject object's dependencies (Dependency Injection)

		// create spring container
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());

		// close the context
		context.close();
	}

}
