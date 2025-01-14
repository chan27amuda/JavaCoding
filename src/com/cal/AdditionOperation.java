package com.cal;

public class AdditionOperation {

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;
		double number3 = 40;

		addNumbers(number1, number2); // Method Calling

		addNumbers(number1, number3); // Method Calling

		addNumbers(number1, number2, number3);// Method Calling

	}

	private static void addNumbers(int number1, int number2) {
		System.out.println(number1 + number2);

	}

	private static void addNumbers(int number1, double number3) {
		System.out.println(number1 + number3);

	}

	private static void addNumbers(int number1, int number2, double number3) {
		System.out.println(number1 + number2 + number3);

	}

}
