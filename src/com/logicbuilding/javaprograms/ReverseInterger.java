package com.logicbuilding.javaprograms;

public class ReverseInterger {

	/*
	 * Reverse the given number
	 * 
	 * Example 1:- Input: x = 123 Output: 321
	 * 
	 * Example 2:- Input: x = -123 Output: -321
	 * 
	 * Example 3:- Input: x = 120 Output: 21
	 */

	public static void main(String[] args) {

		int number;
		int result;

		// Example-1:- Input: x = 123 Output: 321
		number = 123;
		result = reverseAnInteger(number);
		System.out.println("Reverse of '"+ number +"' is: " + result);

		// Example-2:- Input: x = -123 Output: -321
		number = -123;
		result = reverseAnInteger(number);
		System.out.println("Reverse of '"+ number +"' is: " + result);

		// Example-3:- Input: x = 120 Output: 21
		number = 120;
		result = reverseAnInteger(number);
		System.out.println("Reverse of '"+ number +"' is: " + result);

	}

	public static int reverseAnInteger(int number) {
		int reverseNumber = 0;
		int lastDigit;

		while (number != 0) {
			lastDigit = number % 10;
			//check for OverFlow... return 0;
			if(reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE && lastDigit > 7)) {
				return 0;
			}
			//Check for Underflow... return 0;
			if(reverseNumber < Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE && lastDigit < -8)) {
				return 0;
			}
			reverseNumber = reverseNumber * 10 + lastDigit;
			number = number / 10;
		}
		return reverseNumber;
	}

}
