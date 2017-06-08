package com.situ.day21;

public class Outer {
	public void show() {
		System.out.println("外部类的show方法");
	}
	
	public class Inner {
		public void show() {
			System.out.println("内部类的show");
		}
	}

}
