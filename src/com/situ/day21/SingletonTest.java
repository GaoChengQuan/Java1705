package com.situ.day21;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton singleton1 = new Singleton();
//		Singleton singleton2 = new Singleton();
//		Singleton singleton3 = new Singleton();
		System.out.println();
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
	}
}
