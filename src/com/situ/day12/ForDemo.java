package com.situ.day12;

import org.junit.Test;

public class ForDemo {
	@Test
	public void test1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello World!");
		}
	}
	
	@Test
	public void sum() {
		int sum = 0;
		for (int i = 1; i <=100; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);
	}
	
	@Test
	public void sum1() {
		int sum = 0;
		int i = 1;
		for (; i <= 100;) {
			sum += i;
			i++;
		}
		System.out.println("sum: " + sum);
	}
	
	@Test
	public void countNum() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
			}
		}
		System.out.println("count:" + count);
	}
}
