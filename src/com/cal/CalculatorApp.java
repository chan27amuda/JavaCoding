package com.cal;

public class CalculatorApp {

	public static void main(String[] args) {

		double number1;
		int number2;
		double result;

		number1 = 100;
		number2 = 5;

		// Sum of two number
		result = calculateSum(number1, number2); // Method Calling
		System.out.println("Sum of 2 Numbers " + number1 + " and " + number2 + " is: " + result);

		// Difference of two number
		result = calculateDifference(number1, number2); // Method Calling
		System.out.println("Difference of 2 Numbers " + number1 + " and " + number2 + " is: " + result);

		// Multiplication of two number
		result = calculateMultiplication(number1, number2); // Method Calling
		System.out.println("Multiplication of 2 Numbers " + number1 + " and " + number2 + " is: " + result);

		// Division of two number
		result = calculateDivision(number1, number2); // Method Calling
		System.out.println("Division of 2 Numbers " + number1 + " and " + number2 + " is: " + result);
	}

	public static double calculateMultiplication(double number1, int number2) {
		double result;
		result = number1 * number2;
		return result;
	}

	public static double calculateSum(double num1, int num2) {

		double result = num1 + num2;
		return result;

	}

	public static double calculateDifference(double num1, int num2) {

		double result = num1 - num2;
		return result;

	}

	public static double calculateDivision(double num1, int num2) {

		double result = num1 / num2;
		return result;

	}

}
