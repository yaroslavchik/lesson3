package com.hillel;

public class Simpleif {

	public static void main(String... args) {
		byte a = 5, b = 12;
		byte max = calcMax (a, b);
		System.out.println ("maximum is: " + max);
	}

	public static byte calcMax(byte a, byte b) {
		byte max = a > b ? a : b;
		return max;
	}
	
	
}