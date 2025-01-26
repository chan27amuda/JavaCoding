package com.strings;

public class StringDemo {

	public static void main(String[] args) {

		int x = 10;
		String name1 = "java"; // Here "java" is a string literal, and it always creates in String Intern Pool
		String name2 = "java";
		int y = 10;

		System.out.println(x == y); // Value Comparison
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name1 == name2); // References HashCode Comparison
		System.out.println(name1.equals(name2)); // Values Comparison

		String name3 = "programming";
		String name4 = "Programming";
		System.out.println(name3 == name4); // References HashCode Comparison
		System.out.println(name3.equals(name4)); // Values Comparison
		System.out.println(name3.equalsIgnoreCase(name4)); // Values Comparison, ignoring the case

		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());

	}

}
