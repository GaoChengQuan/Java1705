package com.situ.day12;

import org.junit.Test;

public class FunctionDemo {
	public static void main(String[] args) {
		//System.out.println(max(13, 5));
		int[] array = new int[4];
		array[0] = 2;
		array[1] = 5;
		array[2] = 7;
		array[3] = 3;
		int result = sum(array);
		System.out.println("sum: " + result);
	}

	/**
	 * 求两个数的最大值
	 * @param num1 传入的数值1
	 * @param num2 传入的数字2
	 * @return 返回最大值
	 */
	public static int max(int num1, int num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
//		Unreachable code
		//return 0;
	}
	
	public static int max1(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	
	
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}
}
