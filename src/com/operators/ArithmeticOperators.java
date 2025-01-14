package com.operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// Mathematical Operators: +, -, *, /, %
		int number1 = 10;
		int number2 = 20;
		double result;

		result = number1 + number2;
		System.out.println("The Sum of " + number1 + " and " + number2 + " is: " + result);

		result = number2 - number1;
		System.out.println("The Difference of " + number1 + " and " + number2 + " is: " + result);

		result = number1 * number2;
		System.out.println("The Multiplication of " + number1 + " and " + number2 + " is: " + result);

		result = ((double) number1) / number2; // Here we are doing explicit Type Casting
		System.out.println("The Division of " + number1 + " and " + number2 + " is: " + result);

		result = number1 % number2;
		System.out.println("The Modular of " + number1 + " and " + number2 + " is: " + result);

	}

}
