package com.logicbuilding.stringprograms;

import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {

		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String Value: ");
		str = scanner.next();
		int lengthOfLastWord = findLenghtOfTheLastWordInAString(str);

		System.out.println("Length of the Last Word in a given String '" + str + "' is: " + lengthOfLastWord);

	}

	public static int findLenghtOfTheLastWordInAString(String str) {
		int count = 0;
		//str = str.trim();
		boolean spaceFound = false;
		char inputArray[] = str.toCharArray();

		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (inputArray[i] != ' ') {
				count = count + 1;
			} else if (count > 0) {
				spaceFound = true;
				return count;

			}
		}
		if (!spaceFound) {
			System.out.println("There is only one word in the String");
			return count;
		}
		return count;
	}

}
