package com.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.interfaces.Coach;

public class MyAppBeanLifecycle {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext3.xml");
		
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);		
		
		
		System.out.println(theCoach.getDailyWorkout());
		
		// close context
		context.close();
	}

}
