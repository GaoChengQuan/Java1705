package com.situ.day12;

import java.util.Scanner;

import org.junit.Test;

public class SwitchDemo {
	@Test
	public void test1() {
		char ch = 'a';
		switch (ch) {
		//case 'a':
		case 97:
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		default://默认执行
			System.out.println("default");
			break;
		}
	}
	
	/**
	 * 1、输入月份、年份判断天数
		1、3、5、7、8、10、12---------------31天
		4、6、9、11-------------------------------30天
		2-----------------------------------------------28/29天
	 */
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		
		if (month < 0 || month > 12) {
			System.out.println("非法的月份！");
			return;
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			if (((year % 4 == 0) && (year % 100 != 0)) 
					|| (year % 400 == 0)) {
				System.out.println("29天");
			} else {
				System.out.println("28天");
			}
			break;
		default:
			break;
		}
	}
	
	/**
	 * 计算学生成绩的等级
	 */
	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的成绩：");
		int score = scanner.nextInt();
		if (score < 0 || score > 100) {
			System.out.println("非法的输入");
			return;
		}
		
		int grade = score / 10;
		switch (grade) {
		case 10:
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("一般");
			break;
		case 6:
			System.out.println("及格");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("不及格");
			break;
		default:
			break;
		}
	}
	
}
