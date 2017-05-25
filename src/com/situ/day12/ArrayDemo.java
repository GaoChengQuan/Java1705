package com.situ.day12;

import org.junit.Test;

public class ArrayDemo {
	@Test
	public void test1() {
		int stu1 = 78;
		int stu2 = 48;
		int stu3 = 88;
		int stu4 = 75;
		
		int[] array = new int[4];
		array[0] = 3;
		array[1] = 5;
		array[2] = 6;
		array[3] = 1;
		System.out.println(array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (int i = array.length - 1; i >=0 ;i--) {
			System.out.println(array[i]);
		}
		
		long[] array1 = new long[4];
		
	}
}
