package com.logicbuilding.stringprograms;

public class FrequencyOfCharactertersWithoutUsingHashMapInString {

	public static void main(String[] args) {

		String str = "abccaabdd";
		int frequency[] = new int[256];

		char[] inputArray = str.toCharArray();

		for (char currentChar : inputArray) {
			if (currentChar != ' ')
				frequency[currentChar]++;
		}

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.print((char) i + "" + frequency[i]);
			}
		}
	}

}
