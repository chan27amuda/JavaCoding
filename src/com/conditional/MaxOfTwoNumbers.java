package com.conditional;

public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		int number1 = 24;
		int number2 = 44;

		// Max Number: 44

		if (number1 > number2)
			System.out.println("The Max Number is: " + number1);
		else
			System.out.println("The Max Number is: " + number2);

		// Max of Number using Ternary Operator
		int maxNumber = (number1 > number2) ? number1 : number2;
		System.out.println("The max of 2 Numbers " + number1 + " and " + number2 + " is: " + maxNumber);

	}

}
