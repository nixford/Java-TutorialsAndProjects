package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppConfiguredWithXML {

	public static void main(String[] args) {

		// create spring container
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}
