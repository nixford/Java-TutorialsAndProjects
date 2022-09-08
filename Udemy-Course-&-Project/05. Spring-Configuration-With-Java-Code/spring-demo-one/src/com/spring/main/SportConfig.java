package com.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.beans.SwimCoach;
import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;
import com.spring.services.BigFortuneService;

@Configuration
@ComponentScan("com.spring.main, com.spring.beans, com.spring.services")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// EXAMPLE FOR manual bean configuration 
	// define bean for our big fortune service
	@Bean
	public FortuneService bigFortuneService() {
		return new BigFortuneService();
	}
	
	// EXAMPLE FOR manual bean configuration 
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(bigFortuneService());
	}
}
