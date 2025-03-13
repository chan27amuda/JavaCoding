package com.logicbuilding.stringprograms;

import java.util.HashMap;

public class FrequencyOfSpecialCharacters {

	public static void main(String[] args) {

		String str = "Abc#@3$@@ 123";

		char[] inputArray = str.toCharArray();
		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		for (char c : inputArray) {
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c == ' '))) {
				if (frequencyMap.containsKey(c)) {
					frequencyMap.put(c, frequencyMap.get(c) + 1);
				} else {
					frequencyMap.put(c, 1);
				}
			}

		}

		System.out.println(frequencyMap);

		for (char c : frequencyMap.keySet()) {
			System.out.println(c + " " + frequencyMap.get(c));
		}

	}

}
