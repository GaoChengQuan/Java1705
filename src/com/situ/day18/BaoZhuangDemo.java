package com.situ.day18;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BaoZhuangDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//list.add(new Stu());
		list.add(1);
		String str = 12 + "";
		
		System.out.println(Integer.toString(34));
		System.out.println(Double.toString(3.14));
		
		String str1 = "34";
		//1.
		System.out.println(Integer.parseInt(str1));
		//2.
		Integer integer = new Integer(str1);
		int value = integer.intValue();
		System.out.println(value);
		
		String str2 = "3.14";
		double val2 = Double.parseDouble(str2);
		System.out.println(val2);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
	}
	
	@Test
	public void test() {
		//java.lang.NumberFormatException: For input string: "34a"
		String str = "34a";
		int value = Integer.parseInt(str);
	}
	
	@Test
	public void test1() {
		//Integer integer = new Integer(1);
		Integer integer = 1;//自动装箱，等价于上面的操作
		integer = integer + 2;//进行自动拆箱，integer.intValue + 2，
		//在将得到的和3进行装箱赋给integer。
	}
}
