package com.situ.day12;

import java.util.Scanner;

import org.junit.Test;

public class WhileDemo {
	/**
	 * 输出5遍HelloWorld
	 */
	@Test
	public void test1() {
		int i = 1;//1、循环条件的初始化。
		while(i <= 5) {//2、循环条件的控制。
			System.out.println("HelloWorld!");
			i++;//3、循环条件的改变(趋向于循环条件的结束)。
		}
	}
	
	/**
	 * 1+2+3+4+...+100
	 */
	@Test
	public void test2() {
		int i = 1;//1、循环条件的初始化
		int sum = 0;
		while(i <= 100) {//2、循环条件的控制。
			sum += i;
			i++;//3、循环条件的改变(趋向于循环条件的结束)。
		}
		System.out.println("sum: " + sum);
	}
	
	/**
	 * 1*9=9(1*9)  2*9=18(2*9)  3*9=27(3*9) ....  9*9=81(9*9)
	 *           
	 */
	@Test
	public void test3() {
		int i = 1;
		while (i <= 9) {
			System.out.print(i + "*9=" + (i * 9) + "\t");
			i++;
		}
	}
	
	@Test
	public void test4() {
		//生成1-1000以内随机数
		//Returns a double value with a positive sign,
		//greater than or equal to 0.0 and less than 1.0. 
		//    	  0.0-------------0.99999999....
		// *1000  0.0-------------999.999999....
		// +1     1.0-------------1000.99999....
		//(int)   1---------------1000
		int random = (int) (Math.random() * 1000 + 1);
		System.out.println(random);
		System.out.println("猜吧！");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();//1
		while (random != num) {//2
			if (num == 0) {
				System.out.println("下次再来");
				return;
			}
			
			if (num > random) {
				System.out.println("太大了");
			} else {
				System.out.println("太小了");
			}
			
			System.out.println("猜吧!");
			num = scanner.nextInt();//3
		}
		System.out.println("恭喜你猜对了");
	}
	
	@Test
	public void doWhile() {
		Scanner scanner = new Scanner(System.in);
		int pwd = 0;
		do {
			System.out.println("请输入密码：");
			pwd = scanner.nextInt();
		} while (123 != pwd);
	}
}
