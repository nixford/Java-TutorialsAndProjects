package com.spring.services;

import org.springframework.stereotype.Component;

import com.spring.interfaces.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {		
		return "HappyFortuneService - getFortune()";
	}

}
