package com.situ.day23;

import org.junit.Test;

public class TTTT {
	public static void main(String args[]) {
		String textString = new String("java");
		StringBuffer textBuffer = new StringBuffer("java");
		stringReplace(textString);
		bufferReplace(textBuffer);
		System.out.println(textString + textBuffer);
		
		System.out.println(test11());
	}
	
	public static void stringReplace(String text) {
		//Returns a new string resulting from replacing all occurrences 
		//of oldChar in this string with newChar. 
		text = text.replace('j', 'L');
	}

	public static void bufferReplace(StringBuffer text) {
		//Appends the specified string to this character sequence. 
		text = text.append("c");
	}
	
	@Test
	public void test2() {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = j++;
			// 1. int temp = j;
			// 2. j=j+1;
			// 3. j=temp;
			System.out.println(i);
		}
		System.out.println(j);// 0
		
	}

	@Test
	public void test() {
		try {
			System.out.println("Hello");
			// Terminates the currently running Java Virtual Machine.
			System.exit(0);
		} finally {
			System.out.println("good-bye");
		}
	}
	
	static int test11(){
		int x = 1;
		try {
			x++;
		} finally {
			return ++x;
		}
	}

}
