package com.strings;

import java.util.Arrays;

public class StringSplitMethod {

	public static void main(String[] args) {

		String data = "Hello World Java Programming";

		// split() method
		String[] splitData = data.split(" "); // Splits the string based on the specified regular expression
												// 'Whitespace'

		for (String temp : splitData) {
			System.out.println(temp);

		}

		System.out.println(Arrays.toString(splitData));

	}

}
