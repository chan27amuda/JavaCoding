package com.operators;

public class TernaryOperators {
	public static void main(String[] args) {
		int a = 120;
		int b = 100;

		int max = (a > b) ? a : b;
		System.out.println("The max value is: " + max);

		// Find whether the number is even or not
		int number = 25;
		boolean isEven = (number % 2 == 0) ? true : false;
		System.out.println("The given number " + number + " is Even: " + isEven);
	}

}
