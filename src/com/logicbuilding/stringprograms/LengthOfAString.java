package com.logicbuilding.stringprograms;

public class LengthOfAString {

	public static void main(String[] args) {

		String inputString = "Java"; 

		// Find Length of a String using In-built Method
		int lengthOfString = findLengthOfAStringUsingInbuiltMethod(inputString);
		System.out.println("The length of a given String is: " + lengthOfString);

	}

	public static int findLengthOfAStringUsingInbuiltMethod(String stringInput) {
		int lengthOfString;
		lengthOfString = stringInput.length();
		return lengthOfString;
	}

}
