package com.strings;

public class StringMethodsExamples {

	public static void main(String[] args) {

		String data = "apple";
		String data2 = "Apple";
		String data3 = "   apple    ";
		String data4 = "";

		// equals and equalsIgnoreCase
		System.out.println(data.hashCode());
		System.out.println(data2.hashCode());
		System.out.println(data == data2); // Check the references!! HashCode Comparison
		System.out.println(data.equals(data2)); // Check the values!! Values Comparison (Case Sensitive)
		System.out.println(data.equalsIgnoreCase(data2)); // Check the values!! Values Comparison (Case Insensitive)

		// length() check
		System.out.println(data.length()); // Returns the size of the string
		System.out.println(data3.length()); // Returns the size of the string including spaces

		// trim() check
		System.out.println(data3.trim().length()); // Removes the leading and trailing spaces from the string and
													// returns the size of the string

		// toLowerCase() and toUpperCase()
		System.out.println(data2); // Original String
		System.out.println(data2.toLowerCase()); // Converts the string to LowerCase
		System.out.println(data2.toUpperCase()); // Converts the string to UpperCase

		// String Concatenation
		System.out.println(data.concat("123")); // Concatenates the strings using inbuilt method
		System.out.println(data + "123"); // Concatenates the strings

		// charAt() method
		System.out.println(data.charAt(4)); // Returns the character at the specified index

		// contains() method
		System.out.println(data.contains("pp")); // Checks if the string contains the specified sequence of char values
		System.out.println(data.contains("123")); // Checks if the string contains the specified sequence of char values

		// isEmpty() method
		System.out.println(data.isEmpty()); // Checks if the string is empty
		System.out.println(data4.isEmpty()); // Checks if the string is empty

		System.out.println(1 + ""); // Converts the integer to string
		
		

	}

}
