package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {

	public static String studentName[] = new String[100];
	public static int studentAge[] = new int[100];
	public static double marksObtainedInEnglish[] = new double[100];
	public static double marksObtainedInScience[] = new double[100];
	public static double marksObtainedInMaths[] = new double[100];
	public static String studentGrade[] = new String[100];
	public static int studentRollNumber[] = new int[100];

	public static Scanner scanner = new Scanner(System.in);

	public static int index = 0;

	public static void main(String[] args) {
		// Store the information of the Student

		System.out.println("Student Management System");

		while (true) {

			// Reading values from the terminal or console!
			Scanner scanner = new Scanner(System.in);

			int option;
			System.out.println("1. Add a Student");

			System.out.println("2. Print Student Details");

			System.out.println("3. Print All Student Details");

			System.out.println("4. Exit");

			System.out.println("Enter an Option [1-4]");
			option = scanner.nextInt();

			switch (option) {

			case 1:
				addStudent(); // Static Methods can Call another Static Method!!
				break;

			case 2:
				printStudentInformation(); // Static Methods can Call another Static Method!!
				break;

			case 3:
				printAllStudentInformation(); // Static Methods can Call another Static Method!!
				break;

			case 4:
				exitApp(); // Static Methods can Call another Static Method!!
				break;

			}

		}

	}

	public static void exitApp() {
		System.out.println("Exiting from the Student Management System App....");
		System.exit(0);

	}

	public static void printAllStudentInformation() {
		System.out.println("Printing All Student Information");

		for (int i = 0; i < index; i++) {
			System.out.println("Name: " + studentName[i]);
			System.out.println("Age: " + studentAge[i]);
			System.out.println("Student RollNumber: " + studentRollNumber[i]);
			System.out.println("Marks Otained: {");
			System.out.println("	English: " + marksObtainedInEnglish[i]);
			System.out.println("	Science: " + marksObtainedInScience[i]);
			System.out.println("	Math: " + marksObtainedInMaths[i]);
			System.out.println("	}");
			System.out.println("Student Grade: " + studentGrade[i]);

			System.out.println("=================================================");
		}

	}

	public static void printStudentInformation() {
		System.out.println("Print Student Information");
		System.out.println("Enter the Index");
		int userIndex = scanner.nextInt();

		System.out.println("Name: " + studentName[userIndex]);
		System.out.println("Age: " + studentAge[userIndex]);
		System.out.println("Student RollNumber: " + studentRollNumber[userIndex]);
		System.out.println("Marks Otained: {");
		System.out.println("	English: " + marksObtainedInEnglish[userIndex]);
		System.out.println("	Science: " + marksObtainedInScience[userIndex]);
		System.out.println("	Math: " + marksObtainedInMaths[userIndex]);
		System.out.println("	}");
		System.out.println("Student Grade: " + studentGrade[userIndex]);

	}

	public static void addStudent() {

		System.out.println("Enter the Student Name: ");
		studentName[index] = scanner.next();

		System.out.println("Enter the Student Age: ");
		studentAge[index] = scanner.nextInt();

		System.out.println("Enter the Student Roll Number: ");
		studentRollNumber[index] = scanner.nextInt();

		System.out.println("Enter the Student Marks for English: ");
		marksObtainedInEnglish[index] = scanner.nextDouble();

		System.out.println("Enter the Student Marks for Science: ");
		marksObtainedInScience[index] = scanner.nextDouble();

		System.out.println("Enter the Student Marks for Math: ");
		marksObtainedInMaths[index] = scanner.nextDouble();

		double totalMarksObtained = marksObtainedInEnglish[index] + marksObtainedInMaths[index]
				+ marksObtainedInScience[index];
		double percentageObtained = totalMarksObtained / 3.0;

		if (percentageObtained >= 95) {
			studentGrade[index] = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[index] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[index] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[index] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[index] = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade[index] = "C";
		} else if (percentageObtained >= 65) {
			studentGrade[index] = "D";
		} else {
			studentGrade[index] = "F";
		}
		index = index + 1;// index++

		System.out.println("Student Information Stored Successfully");
	}

}
