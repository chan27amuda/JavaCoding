package com.demo.constructors;

public class Employee {

	private String name;

	private Employee(String name) {
		this.name = name;
	}

	public static Employee createEmployeeAccount(String name) {
		Employee emp = new Employee(name);
		return emp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
