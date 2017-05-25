package com.situ.day12;

import org.junit.Test;

public class ForForDemo {

	/**
	    ****
		****
		****
	 */
	@Test
	public void test1() {
		//****
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		//*
		//*
		//*
		for (int j = 1; j <=3; j++) {
			System.out.println("*");
		}
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
    * 
	**
	***
	****
	*****
	 */
	@Test
	public void test2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//i=1  1
		//i=2  2
		//i=3  3
	}
	
	@Test
	public void test3() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				//1*9=9
				System.out.print(j + "*" + i + "="  + (i * j) + "\t");
			}
			System.out.println();
		}
	}
	
	
}
