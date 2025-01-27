package com.logicbuilding.javaprograms;

public class NumberIsArmstrongOrNot {

	public static void main(String[] args) {

		int number = 153;
		int armStrongNumber;

		armStrongNumber = checkIfNumberisArmstrongOrNot(number);
		if (armStrongNumber == number) {
			System.out.println("The given Number " + number + " is an Armstrong Number");
		} else {
			System.out.println("The given Number " + number + " is not an Armstrong Number");
		}

	}

	public static int checkIfNumberisArmstrongOrNot(int number) {
		int result = 0;
		int lastDigit;

		while (number != 0) {
			lastDigit = number % 10;
			result = result + (lastDigit * lastDigit * lastDigit);
			number = number / 10;
		}

		return result;
	}

}
