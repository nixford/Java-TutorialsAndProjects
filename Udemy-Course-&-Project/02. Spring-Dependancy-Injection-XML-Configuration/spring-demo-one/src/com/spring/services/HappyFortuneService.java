package com.spring.services;

import com.spring.interfaces.Fortune;

public class HappyFortuneService implements Fortune {
	
	private String className = getClass().getName();

	@Override
	public String getFortune(String className) {		
		return "getFortune() from: " + className;
	}

}
