package com.arrays;

public class Traverse2DimensionalArray {

	public static void main(String[] args) {

		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println("Printing 1-D Array elements using for loop");
		for (int index = 0; index <= a.length - 1; index++) {
			System.out.println(a[index]);
		}

		System.out.println("Printing 1-D Array elements using enhanced for loop");
		for (int element : a) {
			System.out.println(element);
		}

		int b[][] = new int[2][2];
		b[0][0] = 10;
		b[0][1] = 20;
		b[1][0] = 30;
		b[1][1] = 40;

		System.out.println("Printing 2-D Array elements using for loop");
		for (int rowIndex = 0; rowIndex <= b.length - 1; rowIndex++) {
			for (int colIndex = 0; colIndex <= b[0].length - 1; colIndex++) {
				System.out.print(b[rowIndex][colIndex] + "  ");
			}
			System.out.println("");// Print on the next line
		}

	}

}
