package com.dku.com.dku.junit.first;

public class MultiplyierClass {
	public int multiply(int x, int y) {
		if (x > 500) {
			throw new IllegalArgumentException("first input should be less than 500");
		}
		return x * y;
	}
}
