package com.spring.services;

import com.spring.interfaces.FortuneService;

public class BigFortuneService implements FortuneService {

	@Override
	public String getFortune() {		
		return "BigFortuneService - getFortune()";
	}

}
