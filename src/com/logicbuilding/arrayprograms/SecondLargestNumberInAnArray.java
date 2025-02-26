package com.logicbuilding.arrayprograms;

public class SecondLargestNumberInAnArray {

	public static void main(String[] args) {

		int[] array = { 1, 3, 4, 7, 5, 7, -6, 4 };

		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;

		for (int num : array) {
			if (num > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = num;
			} else if (num > secondLargestNumber && num != largestNumber) {
				secondLargestNumber = num;
			}
		}

		System.out.println("Second Largest Number in an Array: " + secondLargestNumber);

	}

}
