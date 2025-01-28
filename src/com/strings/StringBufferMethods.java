package com.strings;

public class StringBufferMethods {

	public static void main(String[] args) {

		String str = "Hello World"; // It will be created in the String Intern Pool

		String str1 = new String("Hello World"); // It will be created in the Heap Memory

		StringBuffer sb = new StringBuffer("Hello World"); // It will be created in the Heap Memory

		// Length of the String Literal or String Object
		System.out.println("Length of the String Literal: " + str.length());
		System.out.println("Length of the String Object: " + str1.length());

		// Length of the StringBuffer Object
		System.out.println("Length of the StringBuffer Object: " + sb.length());

		// Concat (String) or append (StringBuffer) method
		System.out.println(str + "123"); // This will create a new String Object using + operator
		System.out.println(str.concat("1234")); // This will create a new String Object using concat method

		System.out.println(sb.append(123)); // This will change the existing StringBuffer Object using append method

		// charAt method - same for String and StringBuffer
		System.out.println(str.charAt(0));
		System.out.println(sb.charAt(0));

		// indexOf method
		System.out.println(str.indexOf('e')); // It will return the index of the first occurrence of the character
		System.out.println(str.indexOf("ello")); // It will return the index of the first occurrence of the substring

		System.out.println(sb.indexOf("ello")); // It will return the index of the first occurrence of the substring
		System.out.println(sb.indexOf("e")); // It will return the index of the first occurrence of the character

		// lastIndexOf - Same for String and StringBuffer
		System.out.println(str.lastIndexOf('l'));
		System.out.println(sb.lastIndexOf("l"));

		// isEmpty() - Same for String and StringBuffer
		System.out.println(str.isEmpty());
		// System.out.println(sb.isEmpty()); //This method is introduced in StringBuffer
		// from Java15

		// reverse() - Only for StringBuffer
		System.out.println(sb.reverse());

		// insert(int offSet, String str) - Only for StringBuffer
		StringBuffer sb1 = new StringBuffer("Hello World");
		System.out.println(sb1.insert(5, " Java"));

		// deleteCharAt() - Only for StringBuffer
		System.out.println(sb1.deleteCharAt(4));

		// delete() - Only for StringBuffer - it will delete from a range
		System.out.println(sb1.delete(0, 4));

		// replace(int startIndex, int endIndex, String subString)
		StringBuffer sb2 = new StringBuffer("Hello Java World");
		System.out.println(sb2.replace(0, 5, "Hi"));

		// capacity() - Only for StringBuffer
		StringBuffer capacity = new StringBuffer();
		System.out.println("Initial Capacity of StringBuffer Object: " + capacity.capacity());

		StringBuffer capacity1 = new StringBuffer("Hello");
		System.out.println("Capacity of StringBuffer Object by assigning 'Hello' to it is: " + capacity1.capacity());
		capacity1.append("This is a sample text that i am adding to the StringBuffer");
		System.out.println(capacity1.length());
		System.out.println("Capacity of StringBuffer Object after adding extra String: " + capacity1.capacity());

	}

}
