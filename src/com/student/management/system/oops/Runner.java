package com.student.management.system.oops;

public class Runner {

	public static void main(String[] args) {

		Student s1 = new Student("Uday", 17, 25, 80, 70, 71, "B");
		s1.setName("Uday");
		s1.setRollNumber(22);
		s1.setAge(17);
		s1.setMarksObtainedInEnglish(67);
		s1.setMarksObtainedInMaths(84);
		s1.setMarksObtainedInScience(78);
		s1.setGrade("A");
		System.out.println(s1);

		Student s2 = new Student("Sam", 18, 24, 76, 90, 80, "B");
		System.out.println(s2);

		Student s3 = new Student("Sam", 18, 24, 76, 90, 80, "B");

		System.out.println("Comparing s1 and s2 Objects: " + s1.equals(s2));
		System.out.println("Comparing s2 and s3 Objects: " + s2.equals(s3));

	}

}
