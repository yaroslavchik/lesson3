package com.hillel;

public class Simpleif {

	public static void main(String... args) {
		int a = 10, b = 15, c = 3;
		
		int max = (a > b && a > c) ? a : (b > c ? b : c);
	}
}