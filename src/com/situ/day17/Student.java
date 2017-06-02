package com.situ.day17;

import java.util.Arrays;


public class Student {
	private String name;
	private int age;
	//静态变量
	public static String country = "CN";
	//private static int[] array = new int[100000];
	
	//静态代码块 
	static {
		System.out.println("stitic code.");
	}

	public Student() {
		super();
	}

	public Student(String name, int age) {
		System.out.println("Student");
		// super();
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	//实例方法
	public String getCountry() {
		return country;
	}
	//静态方法
	public static void show() {
		//Cannot make a static reference to the non-static field name
		//System.out.println("country: " + country + ", name: " + name);
		//setCountry("CN");
		//this super
		speak();
	}
	
	public static void speak() {
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	

}
