package com.situ.day20;


public class RunnableDemo {
	public static void main(String[] args) {
		RunnableThread runnable = new RunnableThread();
		Thread thread = new Thread(runnable);
		thread.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main" + i);
		}
	}
}
