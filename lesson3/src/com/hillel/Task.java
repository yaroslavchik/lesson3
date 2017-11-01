package com.hillel;

import java.util.Scanner;

public class Task {

	public static void main(String... args) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Print day's amount: ");
			int days = scanner.nextInt();

			System.out.println ("Print price for 1 day: ");
			int price = scanner.nextInt();

			int totalPrice = price * days;
			
			if ( days > 5 && days < 7) {
				totalPrice -= 20;
			}
			if ( days > 7 ) {
				totalPrice -= 50;
			}
		System.out.println ("Your price is: " + totalPrice + " For: " + days + " days");
	}
}           