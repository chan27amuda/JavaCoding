package com.student.management.system.oops;

import java.util.Objects;

public class Student {

	private String name;
	private int age;
	private int rollNumber;
	private double marksObtainedInEnglish;
	private double marksObtainedInMaths;
	private double marksObtainedInScience;
	private String grade;

	public Student(String name, int age, int rollNumber, double marksObtainedInEnglish, double marksObtainedInMaths,
			double marksObtainedInScience, String grade) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.marksObtainedInEnglish = marksObtainedInEnglish;
		this.marksObtainedInMaths = marksObtainedInMaths;
		this.marksObtainedInScience = marksObtainedInScience;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 21 && age >= 10) {
			this.age = age;
		} else {
			System.out.println("Invalid Age for a Student!!");
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber >= 1) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("Invalid Roll Number!!");
		}
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish <= 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
			System.out.println("Invalid Marks for English");
		}
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		this.marksObtainedInMaths = marksObtainedInMaths;
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		this.marksObtainedInScience = marksObtainedInScience;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void calculateTotalMarks() {

		double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		System.out.println("Total Marks Obtained: " + totalMarks);

	}

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, marksObtainedInEnglish, marksObtainedInMaths, marksObtainedInScience, name,
				rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", marksObtainedInEnglish="
				+ marksObtainedInEnglish + ", marksObtainedInMaths=" + marksObtainedInMaths
				+ ", marksObtainedInScience=" + marksObtainedInScience + ", grade=" + grade + "]";
	}

}
