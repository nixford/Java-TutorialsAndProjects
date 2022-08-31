package com.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.interfaces.Coach;

public class MyAppBeanScope {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);		
		Coach alpfaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alpfaCoach);
		System.out.println(result);
		
		// SCOPE SINGELTON - print qualified name and memory location (@1e802ef9)
		System.out.println(theCoach); // com.spring.beans.TrackCoach@1e802ef9
		System.out.println(alpfaCoach); // com.spring.beans.TrackCoach@1e802ef9
		
		// SCOPE PROTOTYPE:
			// com.spring.beans.TrackCoach@2b6faea6
			// com.spring.beans.TrackCoach@778d1062
		
		// close context
		context.close();
	}

}
