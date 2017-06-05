package com.situ.day18.homework;

import java.util.Scanner;

import org.junit.Test;

public class HomeWork {
	
	/**
	 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
	 * 4560654
	 * 45600654
	 */
	@Test
	public void huiWen() {
		Scanner scanner = new Scanner(System.in);
		String numStr = scanner.next();//"12321"
		char[] numArray = numStr.toCharArray();
		boolean isHuiWen = true;
		for (int i = 0; i < numArray.length / 2; i++) {
			//i=0    numArray.length - 1
			//i=1	 numArray.length - i - 1
			if (numArray[i] != numArray[numArray.length - i - 1]) {
				isHuiWen = false;
			}
		}
		if (isHuiWen == true) {
			System.out.println("这是回文");
		} else {
			System.out.println("这不是回文");
		}
	}
}
