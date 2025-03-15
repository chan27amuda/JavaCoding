package com.logicbuilding.arrayprograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArrayBruteForce {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 7, 8, 8, 3, 3 }; // Example array with an element repeating 3 times

		// Set to store duplicate elements (ensures uniqueness)
		Set<Integer> duplicateElements = new HashSet<>();

		// Flag to check if duplicates are found
		boolean duplicatesFound = false;

		System.out.println("Duplicate elements in the array are:");

		// Iterate through the array
		for (int i = 0; i < array.length - 1; i++) {
			// Compare the current element with the rest of the elements
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					// If a duplicate is found, add it to the set
					duplicateElements.add(array[i]);
					duplicatesFound = true;
					break; // Break to avoid adding the same duplicate multiple times
				}
			}
		}

		// Print the unique duplicate elements
		if (duplicatesFound) {
			for (int num : duplicateElements) {
				System.out.print(num + " ");
			}
		} else {
			System.out.println("No duplicate elements found in the array.");
		}
	}

}
