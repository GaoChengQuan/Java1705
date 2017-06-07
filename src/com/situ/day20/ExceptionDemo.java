package com.situ.day20;

import org.junit.Test;

import com.sun.org.apache.xpath.internal.operations.Div;

public class ExceptionDemo {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 0;
		try {
			//需要被检测的代码（可能出现异常，也可能不出现）
			int result = num1 / num2;
		} catch (ArithmeticException e) {
			//捕获异常后处理异常
			System.out.println("+++++");
			e.printStackTrace();
		} finally {
			//一定会被执行的代码（不管你这个异常出没出现）
			System.out.println("-----");
		}
		
		System.out.println("**********");
	}
	
	@Test
	public void test() {
		int num1 = 3;
		int num2 = 0;
		div(2, 4);
		try {
			//需要被检测的代码（可能出现异常，也可能不出现）
			//int result = num1 / num2;
			int result = div(num1, num2);
		} catch (ArithmeticException e) {
			//捕获异常后处理异常
			System.out.println("ArithmeticException");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			//捕获异常后处理异常
			System.out.println("ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			//一定会被执行的代码（不管你这个异常出没出现）
			System.out.println("-----");
		}
		
		System.out.println("**********");
	}

	private int div(int num1, int num2) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		int[] array = new int[2];
		String str = null;
		str.charAt(0);
		array[2] = 9;
		return num1 / num2;
	}
}
