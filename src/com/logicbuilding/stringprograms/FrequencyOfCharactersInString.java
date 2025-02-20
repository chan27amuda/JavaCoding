package com.logicbuilding.stringprograms;

import java.util.HashMap;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {

		String str = "aaaabbbccd aabddcee";

		// Convert String to charArray
		char[] inputArray = str.toCharArray();
		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		for (char character : inputArray) {

			if (character != ' ') {

				frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
			}
		}
		System.out.println(frequencyMap);

		for (char charFrequency : frequencyMap.keySet()) {
			System.out.print(charFrequency + "" + frequencyMap.get(charFrequency));
		}
	}

}
