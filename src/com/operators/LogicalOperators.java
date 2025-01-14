package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// Logical Operators!! --> Comes for Multiple Conditions
		// Logical AND: && --> All the conditions needs to be true
		// Logical OR: || --> At least one condition needs to be true
		// Logical NOT: ! --> Inversion

		int number1 = 5;
		int number2 = 4;
		int number3 = 2;

		System.out.println((number1 > number2) && (number1 < number3)); // false
		System.out.println((number1 > number2) || (number1 < number3)); // true
		System.out.println(!((number1 > number2) || (number1 < number3)));// false

	}

}
