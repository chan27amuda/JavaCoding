package com.logicbuilding.javaprograms;

import java.util.Arrays;
import java.util.HashMap;

public class CalculateTwoSum {

	public static void main(String[] args) {

		int[] array = { 2, 11, 7, 5 };
		int target = 9;

		int[] result = calculateTwoSum(array, target);
		System.out.println(Arrays.toString(result));

	}

	private static int[] calculateTwoSum(int[] array, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			int compliment = target - array[i];
			if (map.containsKey(compliment)) {
				int[] result = { map.get(compliment), i };
				return result;
			}
			map.put(array[i], i);
		}

		return new int[0];
	}

}
