package com.arrays;

import java.util.Arrays;

public class DemoJaggedArrays {

	public static void main(String[] args) {

		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		for (int temp : a) {
			System.out.println(temp);

		}

		System.out.println(Arrays.toString(a));

		int b[][] = new int[2][2];
		b[0][0] = 10;
		b[0][1] = 20;
		b[1][0] = 40;
		b[1][1] = 60;
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));

		int c[][] = new int[2][];
		c[0] = new int[] { 10, 20, 30 };
		c[1] = new int[] { 40, 50, 60, 70 };

		for (int rowIndex = 0; rowIndex <= c.length - 1; rowIndex++) {
			for (int colIndex = 0; colIndex <= c[rowIndex].length - 1; colIndex++) {
				System.out.print(c[rowIndex][colIndex] + " ");
			}
			System.out.println("");
		}
	}

}
