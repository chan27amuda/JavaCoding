package com.logicbuilding.javaprograms;

import java.math.BigInteger;

public class FactorialOfANumber {

	public static void main(String[] args) {

		int number;
		int factorialResult;
		BigInteger factorialBigResult;

		// Calculate the Factorial of 5
		number = 5;
		factorialResult = calculateFactorialOfANumber(number);
		System.out.println("The Factorial of " + number + "! is: " + factorialResult);

		// Calculate the Factorial of Zero (0!)
		number = 0;
		factorialResult = calculateFactorialOfANumber(number);
		System.out.println("The Factorial of " + number + "! is: " + factorialResult);

		// Calculate the Factorial of a Big Number: 50
		number = 50;
		factorialBigResult = calculateFactorialOfABigNumber(number);
		System.out.println("The Factorial of " + number + "! is: " + factorialBigResult);

	}

	public static int calculateFactorialOfANumber(int number) {
		int factorialResult = 1;

		for (int i = 1; i <= number; i++) {
			factorialResult = factorialResult * i;
		}

		return factorialResult;
	}

	public static BigInteger calculateFactorialOfABigNumber(int number) {
		BigInteger factorialResult = BigInteger.ONE;

		for (int i = 1; i <= number; i++) {
			factorialResult = factorialResult.multiply(BigInteger.valueOf(i));
		}
		return factorialResult;
	}

}
