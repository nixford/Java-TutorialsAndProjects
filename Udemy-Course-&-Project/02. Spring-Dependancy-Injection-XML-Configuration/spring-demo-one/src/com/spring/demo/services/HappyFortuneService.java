package com.spring.demo.services;

import com.spring.demo.interfaces.Fortune;

public class HappyFortuneService implements Fortune {

	@Override
	public String getFortune() {		
		return "class HappyFortuneService - getFortune";
	}

}
