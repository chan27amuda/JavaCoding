package com.logicbuilding.arrayprograms;

public class LargestNumberInAnArray {

	public static void main(String[] args) {

		int[] input = { 10, 20, 30, -88, 60, 70, 50 };
		int largest = input[0];

		for (int i = 1; i <= input.length - 1; i++) {
			if (input[i] > largest) {
				largest = input[i];
			}
		}

		System.out.println("Largest Number in an Array: " + largest);

	}

}
