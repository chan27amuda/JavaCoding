package com.logicbuilding.arrayprograms;

public class MissingElementInIntegerArray {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
		int missingElement;

		int sumOfArrayElements = 0;
		int n = array.length + 1;

		int total = n * (n + 1) / 2;
		System.out.println(total);

		for (int i = 0; i <= array.length - 1; i++) {
			sumOfArrayElements = sumOfArrayElements + array[i];
		}
		System.out.println(sumOfArrayElements);

		missingElement = total - sumOfArrayElements;

		System.out.println("Missing Element in an Array: " + missingElement);

	}

}
