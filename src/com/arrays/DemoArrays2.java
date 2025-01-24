package com.arrays;

public class DemoArrays2 {

	public static void main(String[] args) {

		int marks[] = { 80, 90, 70 };

		for (int index = 0; index <= marks.length - 1; index++) {
			System.out.println(marks[index]);
		}

		// Enhanced for loop (for-each loop)
		for (int mark : marks) {
			System.out.println(mark);

		}
	}

}
