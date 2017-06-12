package com.situ.day22;

import javax.management.monitor.Monitor;

public class Teacher {
	private String name = "android";
	private int age = 18;
	private String address = "qingdao";
	
	private int money;//      0    0      
	private Integer money1;//null  0
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}
}
