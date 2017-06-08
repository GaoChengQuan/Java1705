package com.situ.day21;
//饿汉式
public class Singleton1 {
	//3.
	private static final Singleton1 instance = new Singleton1();
	//1.
	private Singleton1() {
	}
	
	//2.
	public static Singleton1 getInstance() {
		return instance;
	}
}
