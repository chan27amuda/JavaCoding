package com.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 3;

		int result;
		result = number1 & number2;
		System.out.println("Bitwise AND (&) of " + number1 + " & " + number2 + " is: " + result);

		result = number1 | number2;
		System.out.println("Bitwise OR (|) of " + number1 + " | " + number2 + " is: " + result);
		
		result = number1 ^ number2;
		System.out.println("Bitwise Ex-OR (^) of " + number1 + " ^ " + number2 + " is: " + result);
		
		result = ~number1;
		System.out.println("Complement (~) of ~" + number1 + " is: " + result);
		
		result = number1 << 1;
		System.out.println("Left Shift (<<) of " + number1 + " << 1 is: " + result);
		
		result = number1 >> 1;
		System.out.println("Right Shift (>>) of " + number1 + " >> 1 is: " + result);

	}

}
