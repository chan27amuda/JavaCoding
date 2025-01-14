package com.operators;

public class InstanceOfOperator {

	public static void main(String[] args) {
		// instanceof --> tells if an Object belongs to a certain class or not!

		String strName = "Java";
		if (strName instanceof String) {
			System.out.println("Yes");
		}

		StringBuilder strBName = new StringBuilder("Java");
		if (strBName instanceof Object) {
			System.out.println("Yes");
		}

		Integer number = 10;
		if (number instanceof Integer) {
			System.out.println("Yes");
		}

	}

}
