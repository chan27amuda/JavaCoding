package com.strings;

public class StringMethodsPart2 {

	public static void main(String[] args) {

		String data = "Hello World";

		// subString() method
		String result = data.substring(1, 5); // Returns the substring from the specified index. OP: ello .... 1 to 4(5-1)
		System.out.println(result);
		
		// replace() method
		String replacedData = data.replace('l', 'L'); // Replaces all the occurrences of the specified char value
		System.out.println(replacedData);
		
		// indexOf() method
		int index = data.indexOf('o'); // Returns the index of the first occurrence of the specified char value
		System.out.println(index);
		
		// lastIndexOf() method
		int lastIndex = data.lastIndexOf('o'); // Returns the index of the last occurrence of the specified char value
		System.out.println(lastIndex);
	}

}
