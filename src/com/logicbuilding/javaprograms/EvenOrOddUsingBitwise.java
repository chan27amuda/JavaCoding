package com.logicbuilding.javaprograms;

public class EvenOrOddUsingBitwise {

	public static void main(String[] args) {

		int number;
		boolean result;

		// Find whether given number 327 is Even or Odd
		number = 328;
		result = findGivenNumberIsOddOrEvenUsingBitwiseAND(number);
		if (result) {
			System.out.println("The given number " + number + " is Even Number");
		} else {
			System.out.println("The given number " + number + " is Odd Number");
		}

	}

	public static boolean findGivenNumberIsOddOrEvenUsingBitwiseAND(int number) {
		if ((number & 1) == 1) {
			return false;
		} else {
			return true;
		}

	}

}
