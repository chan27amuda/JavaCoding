package com.conditional;

public class GradeCalculator {

	public static void main(String[] args) {
		int percentage = 80;
		char grade;

		if ((percentage > 90 && percentage <= 100))
			grade = 'A';
		else if ((percentage >= 80 && percentage <= 90))
			grade = 'B';
		else if ((percentage >= 70 && percentage < 80))
			grade = 'C';
		else if ((percentage >= 60 && percentage < 70))
			grade = 'D';
		else if (percentage < 60)
			grade = 'F';
		else {
			grade = ' ';
			System.out.println("Something went wrong, please check your Percentage value!!");
		}

		System.out.println("The Grade of a Student is: " + grade);

	}

}
