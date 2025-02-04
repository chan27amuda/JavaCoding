package com.demo.constructors;

public class Runner2 {

	public static void main(String[] args) {

		Employee emp = Employee.createEmployeeAccount("Sam");
		System.out.println(emp.getName());

	}

}
