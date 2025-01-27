package com.logicbuilding.javaprograms;

public class SwapTwoNumbers {
	/*
	 * Write a Java Program to Swap Two Numbers Input: a = 10; b = 20; output: a =
	 * 20; b = 10;
	 */

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Values of a & b before Swapping. a : " + a + "; b : " + b);

		usingTempVariable(a, b);
		withoutUsingTempVariable(a, b);
		usingBitwiseOperator(a, b);

	}

// Solution-1: Using Temp Variable
	public static void usingTempVariable(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("Values of a & b After Swapping using Temp Variable Solution. a : " + a + "; b : " + b);
	}

// Solution-2: Without using Temp Variable (Using Mathematical Operation)
	public static void withoutUsingTempVariable(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(
				"Values of a & b After Swapping without using Temp Variable Solution (Using Mathematical Operation). a : "
						+ a + "; b : " + b);
	}

// Solution-3: Using Bitwise Operator(Manipulation)
	/*
	 * Below are the Bitwise Operators And --> & OR --> | Not --> ~ Ex-OR --> ^ Left
	 * Shift --> << Right Shift --> >>
	 */
	public static void usingBitwiseOperator(int a, int b) {
		// 10 (Decimal Number) --> Binary Number is '1010'
		// 20 (Decimal Number) --> Binary Number is '10100'
		/*
		 * Logic of Ex-OR 1 1 --> 0 0 0 --> 0 1 0 --> 1 0 1 --> 1
		 */

		// a = 10; --> 01010
		// b = 20; --> 10100

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Values of a & b After Swapping using Bitwise Operator 'Ex-OR'. a : " + a + "; b : " + b);
	}

}
