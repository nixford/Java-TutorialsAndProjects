package com.dku.com.dku.junit.first;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyClassTest {
	
	private MyClass tester;
	
	@BeforeEach
	void setup() {
		tester = new MyClass();
	}

	@Test
	void testEsceptionIsThrown() {
		assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5));
	}
	
	@Test
	void testMultiply() {
		assertEquals(50, tester.multiply(10, 5), "10 x 5 must be 50");
	}

}
