package com.loops;

public class SimpleWhileLoop {

	public static void main(String[] args) {
		// Print numbers from 1 to 10
		int number = 1;
		while (number <= 10) {
			System.out.println(number);
			number++;// If we won't increment the value of Number then the while loop will go into
						// Infinite Loop.
		}

	}

}
