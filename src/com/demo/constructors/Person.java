package com.demo.constructors;

public class Person {

	private String name;
	private int id;

	public Person() { // default constructors
		System.out.println("Default COnstructor for Person Class");
	}

	public Person(String name, int id) { // Parameterized Constructor
		this(); // Constructor Chaining
		System.out.println("Parameterized Constructor");
		this.name = name;
		this.id = id;
	}

	public Person(String name) { // Parameterized Constructor
		System.out.println("Parameterized Constructor");
		this.name = name;

	}

	public Person(Person other) { // Copy Constructor
		System.out.println("Copy Constructor");
		this.name = other.name;
		this.id = other.id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
