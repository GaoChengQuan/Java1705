package com.situ.day13;

import org.junit.Test;

public class BreakContinue {
	
	@Test
	public void test() {
		for (int i = 0; i < 6; i++) {
			if (i == 3) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
	
	@Test
	public void test1() {
		for (int i = 0; i < 6; i++) {
			if (i == 3) {
				break;
			}
			System.out.print(i + " ");
		}
	}
	
	@Test
	public void test2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
			System.out.println(i + " ");
		}
	}
	
}
