package com.situ.day13;


import java.util.Arrays;

import org.junit.Test;

public class ArrayDemo {
	@Test
	public void test() {
		int[] array = new int[]{3, 5, 1, 6};
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test1() {
		int[] array = new int[]{3, 5, 1, 6};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(array[1]);
		array = null;
		System.out.println(array[1]);
	}
	
	@Test
	public void test2() {
		int num = 3;
		int[] array = new int[]{1, 4, 2};
	}
	boolean bool;
	double d;
	@Test
	public void test3() {
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
		}
		System.out.println();
		boolean[] boolArray = new boolean[10];
		for (int i = 0; i < boolArray.length; i++) {
			System.out.print(boolArray[i]);
		}
		System.out.println();
		double[] doubleArray = new double[10];
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i]);
		}
		System.out.println();
		//The local variable d may not have been initialized
		System.out.println(d);
		System.out.println(bool);
	}
	
	@Test
	public void sort() {
		//Returns the current time in milliseconds. 
		// 一秒=1000毫秒
		// 1000*60*60*24*365=315亿
		long start = System.currentTimeMillis();
		int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println();
		System.out.println("delta: " + delta);
	}
	
	@Test
	public void bubleSort() {
		int[] array = {40, 21, 17, 1};
		for (int i = 1; i <= array.length - 1 ; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
