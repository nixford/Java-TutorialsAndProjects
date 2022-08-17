package com.dku.com.dku.junit.first;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyClassTest {

	@Test
	void testEsceptionIsThrown() {
		MyClass tester = new MyClass();
		assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5));
	}

}
