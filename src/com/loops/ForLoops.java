package com.loops;

public class ForLoops {

	public static void main(String[] args) {

		// Print numbers 1 to 10 in Reverse Order
		for (int i = 10; i >= 1; i--)
			System.out.println(i);
			System.out.println("Number from 1 to 10 Print in Reverse Order Successfully");

		// Having multiple initialization and increment/decrement inside a for loop
		System.out.println("*************************************************");
		for (int i = 5, j = 1; i >= 1; i--, j++)
			System.out.println(i + " " + j);

		// Above for loop we can also write as below
		System.out.println("*************************************************");
		int i = 5, j = 1;
		for (; i >= 1; i--, j++)
			System.out.println(i + " " + j);

	}

}
