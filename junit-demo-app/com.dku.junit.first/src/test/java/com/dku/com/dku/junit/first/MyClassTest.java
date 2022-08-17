package com.dku.com.dku.junit.first;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyClassTest {
	
	private MultiplyierClass tester;
	
	@BeforeEach
	void setup() {
		tester = new MultiplyierClass();
	}

	@Test
	void testEsceptionIsThrown() {
		assertThrows(IllegalArgumentException.class, () -> tester.multiply(501, 5));
	}
	
	@Test
	void testMultiply() {
		assertEquals(25, tester.multiply(5, 5), "5 x 5 must be 25");
	}
	
	@Test
	public void testGrouped() {
		assertAll(
				() -> assertThrows(IllegalArgumentException.class, () -> tester.multiply(501, 5)),
				() -> assertEquals(25, tester.multiply(5, 5), "5 x 5 must be 25")
		);
	}

}
