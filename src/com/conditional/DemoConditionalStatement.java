package com.conditional;

public class DemoConditionalStatement {

	public static void main(String[] args) {
		// Conditional Statements:
		// if statement

		System.out.println("Hello");
		int c;
		c = 10 + 5;
		if (c > 10)
			System.out.println("c is greater than 10"); // This Line will execute as the if(condition) is true

		c = 10 - 5;
		if (c > 10)
			System.out.println("c is greater than 10"); // This Line will Skip as the if(condition) is false
		System.out.println("Hello"); // This line will execute as the if statement without code block will apply on
										// on the immediate next line

		c = 10 - 5;
		if (c > 10) {
			System.out.println("c is greater than 10");
			System.out.println("Hello");
			// Both the Lines inside the code block will skip as the if(condition) is false
		}

	}

}
