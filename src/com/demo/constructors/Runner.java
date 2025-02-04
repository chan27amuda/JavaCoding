package com.demo.constructors;

public class Runner {

	public static void main(String[] args) {

		Person p1 = new Person("Bunny", 20);
		p1.setId(10);
		p1.setName("Uday");

		Person copyPerson = new Person(p1);
		System.out.println(copyPerson.getName());
		System.out.println(copyPerson.getId());
	}

}
