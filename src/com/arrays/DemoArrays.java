package com.arrays;

public class DemoArrays {

	public static void main(String[] args) {
		int x = 10;
		int marks[] = new int[3];

		System.out.println(x); // 10
		System.out.println(marks); // [I@15db9742
//		System.out.println(marks[0]); // 0
//		System.out.println(marks[1]); // 0
//		System.out.println(marks[2]); // 0
//		System.out.println(marks[3]); // 0
//		System.out.println(marks[4]); // 0
		System.out.println(marks.length); // 5);
		marks[0] = 80;
		marks[1] = 90;
		marks[2] = 70;
		
		int marks1[] = new int[marks.length];

		for (int index = 0; index <= marks.length - 1; index++) {
			System.out.println(marks[index]);
		}

	}

}
