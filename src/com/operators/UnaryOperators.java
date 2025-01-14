package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int a; // declaration
		a = +5; // assignment, positive number

		int b; // declaration
		b = -a; // -5

		System.out.println("The value of b: " + b); // OP: The value of b: -5
		System.out.println("The value of a: " + a); // OP: The value of a: 5

		int c;
		c = ++a; // pre-increment (increment first and then Use it)
		System.out.println("The value of c: " + c); // OP: The value of c: 6
		System.out.println("The value of a after pre-increment: " + a); // OP: The value of a after pre-increment: 6

		c = --a; // pre-decrement (decrement first and then Use it)
		System.out.println("The value of c: " + c); // OP: The value of d: 5
		System.out.println("The value of a after pre-decrement: " + a); // OP: The value of a after pre-decrement: 5

		c = a++; // post-increment (Use First and then increment)
		System.out.println("The value of c: " + c);// OP: The value of e: 5
		System.out.println("The value of a after post-increment: " + a);// OP: The value of a after post-increment: 6

		c = a--; // post-decrement (Use First and then decrement)
		System.out.println("The value of c: " + c);// OP: The value of f: 6
		System.out.println("The value of a after post-decrement: " + a);// OP: The value of a after post-decrement: 5

		boolean isStatus = false;
		isStatus = !isStatus;
		System.out.println("The boolean value of isStatus after Not Operator (!): " + isStatus); // OP: The boolean value of isStatus after Not Operator (!): true

	}

}
