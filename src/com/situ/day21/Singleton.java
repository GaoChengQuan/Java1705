package com.situ.day21;

public class Singleton {
	//3.
	private static Singleton instance = null;
	
	//1.私有化构造方法,好在内部去控制创建实例的数量
	private Singleton() {
	}

	//2.
	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void show() {
		
	}
}
