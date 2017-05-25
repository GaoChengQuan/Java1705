package com.situ.day11;

import java.util.Scanner;

public class HomeWork {
	/**
	 * 1、编写一个收银台收款程序，if
		定义输入----单价、数量、金额
		定义输出----应收金额、找零
		使用double类型变量
		2、当总价>=500时候打八折
		3、考虑程序出现异常的情况，如：收款金额小于应收金额
      	若收款金额大于等于应收金额，则计算找零后输出
      	若收款金额小于应收金额，输出错误信息。
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入单价：");
		double unitPrice = scanner.nextDouble();
		System.out.println("请输入数量:");
		double count = scanner.nextDouble();
		System.out.println("请输入金额：");
		double price = scanner.nextDouble();
		
		double totalPrice = unitPrice * count;
		if (totalPrice >= 500) {
			totalPrice *= 0.8;//totalPrice = totalPrice * 0.8;
		}
		double returnPrice = price - totalPrice;
		if (returnPrice >= 0) {
			System.out.println("应收金额：" + totalPrice + "，找零：" + returnPrice);
		} else {
			System.out.println("顾客给的钱不够");
		}
		
	}

}
