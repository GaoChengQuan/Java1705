package com.situ.day20;

public class ThreadDemo1 {
	public static void main(String[] args) {
		System.out.println("-----start-----");
		//Unhandled exception type InterruptedException
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----end-----");
	}
}
