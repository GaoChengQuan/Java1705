package com.situ.day15;

import com.situ.day13.BreakContinue;

public class Car {
	String brand;
	double price;
	String color;

	public void show() {
		System.out.println("brand: " + brand + ", price: " + price 
				+ ", color: " + color);
	}
	
	public void startup() {
		System.out.println(brand + "品牌的汽车启动");
	}
}
