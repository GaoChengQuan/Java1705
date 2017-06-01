package com.situ.day15;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;


public class HomeWork {
	public static void main(String[] args) {
		 int[] array = new int[] {23, 12, 3, 4, 55, 16};
		 int[] newArray = sortMax(array);
		 for (int i = 0; i < newArray.length; i++) {
			 System.out.print(newArray[i] + " ");
		}
	}
	/*
	 * int[] array = new int[] {23, 12, 3, 4, 55, 16};
	找出数组中的最大值并将找出的最大值放在数组元素最后一个位置的下一个位置。
	 */
	private static int[] sortMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		int[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[newArray.length - 1] = max;
		
		return newArray;
	}
	
	/**
	 * 1、题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
	 */
	@Test
	public void countNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("情输入：");
		String line = scanner.nextLine();
		char[] charLine = line.toCharArray();
		int characterCount = 0;
		int blankCount = 0;
		int digitalCount = 0;
		int otherCount = 0;
		
		for (int i = 0; i < charLine.length; i++) {
			char ch = charLine[i];
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				characterCount++;
			} else if (ch == ' ') {
				blankCount++;
			} else if (ch >= '0' && ch <= '9') {
				digitalCount++;
			} else {
				otherCount++;
			}
		}
		
		System.out.println("字符的个数： " + characterCount);
		System.out.println("空格的个数： " + blankCount);
		System.out.println("数字的个数： " + digitalCount);
		System.out.println("其他的个数： " + otherCount);
	}
	
	/**
	 * 2、题目：输入三个整数x,y,z，请把这三个数由小到大输出。
	 */
	@Test
	public void sort() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int y = scanner.nextInt();
		System.out.println("请输入第三个数：");
		int z = scanner.nextInt();
		//x y z
		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		
		if (x > z) {
			int temp = x;
			x = z;
			z = temp;
		}
		
		if (y > z) {
			int temp = y;
			y = z;
			z = temp;
		}
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
	}
	
	/**
	 * 3、题目：企业发放的奖金根据利润提成。
	 * 利润(I)低于或等于10万元时，奖金可提10%；
	 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
	 * 20万到40万之间时，高于20万元的部分，可提成5%；
	 * 40万到60万之间时高于40万元的部分，可提成3%；
	 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
	 * 从键盘输入当月利润，求应发放奖金总数？
	 */
	@Test
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入利润：");
		double profit = scanner.nextDouble();
		double bonus = 0;
		if (profit > 0 && profit <= 10) {
			bonus = profit * 0.1;
		} else if (profit > 10 && profit <= 20) {
			bonus = 10 * 0.1 + (profit - 10) * 0.075;
		} else if (profit > 20 && profit <= 40) {
			bonus = 10 * 0.1 + 10* 0.075 + (profit - 20) * 0.05;
		}
		
		Arrays.sortDoule(a)
	}

}
