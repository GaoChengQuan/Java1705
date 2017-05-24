package com.situ.day11;

import java.util.Scanner;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class Base {
	public static void main(String[] args) {
	}
	
	@Test
	public void charTest() {
		char c1 = 'a';
		char c2 = '中';
		
		System.out.println(c1);//a
		System.out.println(c1 + 1);//98
		System.out.println(c1 + 2);//99
		System.out.println((char)(c1 + 1));//b
		System.out.println((char)(c1 + 2));//c
	}
	
	@Test
	public void test() {
		//1、整数直接量可以直接赋值给byte、short、char，但是整数直接量不能超过他们的范围。
		byte b = 87;//右侧的数值的方位不超过byte的范围就可以
		//byte b = 87000;
		//2、byte、short、char类型变量参与运算，先一律转换成int再运算。
		short s1 = 99;
		System.out.println(b + s1);
		//Type mismatch: cannot convert from int to short
		//s1 = s1 + 3;
		s1 = (short)(s1 + 3);
		
		short s2 = 34;
		//Type mismatch: cannot convert from int to short
		//short s = s1 + s2; 
	}
	
	/**
	 * 算数运算符：+、-、*、/、%
	 */
	@Test
	public void test2() {
		//分解一个三位数：386=3*100+8*10+6*1
		//百位：3  十位：8 个位：6
		int num = 386;
		int bai = num / 100;//3
		int shi = num % 100 / 10;//8
		int ge  = num % 100 % 10;//6
		System.out.println("百位：" + bai);
		System.out.println("十位：" + shi);
		System.out.println("个位：" + ge);
	}
	
	/**
	 * 逻辑运算符&& ||
	 */
	@Test
	public void test3() {
		//&&短路运算
		int num1 = 3;
		int num2 = 5;
		System.out.println(num1 < 0 && num1++ < num2);
		System.out.println(num1);//3
		System.out.println(num2);//5
		
		//||短路
		System.out.println(num1 > 0 || num1++ < num2);
		System.out.println(num1);//3
		System.out.println(num2);//5
	}
	
	/**
	 * 赋值运算符：=  += *= /= %=
	 */
	@Test
	public void test4() {
		int num = 5;
		num += 3;//num = num + 3;
		System.out.println(num);
		num *= 3;//num = num * 3;
		System.out.println(num);
	}
	
	/**
	 * 三目运算符：
	 */
	@Test
	public void test5() {
		int num1 = 13;
		int num2 = 5;
		//语法：boolean ? 数1 ： 数2;
		int max = num1 > num2 ? num1 : num2;
		System.out.println("max: " + max);
	}
	
	/**
	 * +号运算符：
		1、两边都是数字，则做加法运算。
		2、若一边为字符串，则做字符串的拼接。
	 */
	@Test
	public void test6() {
		int age = 20;
		//我的年龄是20
		System.out.println("我的年龄是" + age);
		//我20岁了
		System.out.println("我" + age + "岁了");
		
		System.out.println(10 + 20 + "" + 30);//3030
		System.out.println("" + 10 + 20 + 30);//102030
	}
	
	/**
	 * ++(自增1) --(自减1)
	 */
	@Test
	public void test7() {
		int i = 3;
		i++;//++i
		System.out.println(i);//4
		System.out.println(i++);//4 (i==5)
		System.out.println(++i);//6
	}
	
	/**
	 * 交换两个整数的值
	 */
	@Test
	public void test8() {
		int num1 = 3;
		int num2 = 5;
		System.out.println("before num1 : " + num1);
		System.out.println("before num2 : " + num2);
		//1
		int temp = num1;
		//2
		num1 = num2;
		//3
		num2 = temp;
		System.out.println("after num1 : " + num1);
		System.out.println("after num2 : " + num2);
	}
	
	@Test
	public void test9() {
		/**
	    * 学生成绩的等级：
	    * >=90 <=100 优秀
	    * >=80 <90 良好
	    * >=70 <80 一般
	    * >=60 <70 及格
	    * <60 不及格
	    *
	    * >100 <0
	    */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的成绩");
		int score = scanner.nextInt();
		if (score < 0 || score > 100) {
			System.out.println("输入的成绩非法");
			return;
		}
		
		if (score >= 90) {
			System.out.println("优秀");
		} else if (score >= 80) {
			System.out.println("良好");
		} else if (score >= 70) {
			System.out.println("一般");
		} else if (score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
	
	@Test
	public void leapYear() {
//		1、能被4整除，但是不能被100整除 &&
//		||
//		2、能被400整除
//
//		(() && ()) || ()
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) 
				|| (year % 400 == 0)) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}
}
