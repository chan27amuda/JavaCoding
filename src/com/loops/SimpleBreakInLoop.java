package com.loops;

public class SimpleBreakInLoop {

	public static void main(String[] args) {

		int i = 1;
		while (true) {
			if (i == 5)
				break; // Exit from the while loop
			else
				System.out.println("Hello I am in a Loop");
			i++;
		}

	}

}
