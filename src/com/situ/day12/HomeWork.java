package com.situ.day12;

import java.util.Scanner;

import org.junit.Test;

public class HomeWork {
	/**
	 *  1
		12
		123
		1234
		12345
	 */
	@Test
	public void test1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//1		1
		//2		12
	}
	
	/**
	 * 2、int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
             求出上面数组中0-9分别出现的次数
	 */
	@Test
	public void countNum() {
		int[] scoreArray={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int[] countArray = new int[10];
		for (int i = 0; i < scoreArray.length; i++) {
			switch (scoreArray[i]) {
			case 0:
				countArray[0]++;
				break;
			case 1:
				countArray[1]++;
				break;
			case 2:
				countArray[2]++;
				break;
			case 3:
				countArray[3]++;
				break;
			case 4:
				countArray[4]++;
				break;
			case 5:
				countArray[5]++;
				break;
			case 6:
				countArray[6]++;
				break;
			case 7:
				countArray[7]++;
				break;
			case 8:
				countArray[8]++;
				break;
			case 9:
				countArray[9]++;
				break;
			default:
				break;
			}
		}
		
		for (int i = 0; i < countArray.length; i++) {
			System.out.println(i + "出现的次数： " + countArray[i]);
		}
	}
	
	/**
	 * 3、int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		要求求出其中的奇数个数和偶数个数。
	 */
	@Test
	public void count() {
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("奇数个数： " + oddCount + ", 偶数个数： " + evenCount);
	}
	
	/**
	 * 4、输入一组学生的成绩，然后计算他们的平均值.
	 */
	@Test
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的个数：");
		int count = scanner.nextInt();
		int[] studentArray = new int[count];
		int sum = 0;
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println("请输入学生的成绩：");
			studentArray[i] = scanner.nextInt();
			sum += studentArray[i];
		}
		
		double avg = (double)sum / studentArray.length;
		System.out.println("平均值：" + avg);
		
	}

}
