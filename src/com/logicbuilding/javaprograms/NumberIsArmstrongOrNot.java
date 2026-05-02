package com.logicbuilding.javaprograms;

public class NumberIsArmstrongOrNot {

	public static void main(String[] args) {

		long number = 153;
		long armStrongNumber;

		armStrongNumber = checkIfNumberisArmstrongOrNot(number);
		if (armStrongNumber == number) {
			System.out.println("The given Number " + number + " is an Armstrong Number");
		} else {
			System.out.println("The given Number " + number + " is not an Armstrong Number");
		}

	}

	public static long checkIfNumberisArmstrongOrNot(long number) {
		long result = 0;
		long lastDigit;
		int digitCount = 0;
		long temp = number;

		while (temp != 0) {
			digitCount++;
			temp = temp / 10;
		}

		temp = number;
		while (temp != 0) {
			lastDigit = temp % 10;
			result = result + (long) Math.pow(lastDigit, digitCount);
			temp = temp / 10;
		}

		return result;
	}

}
