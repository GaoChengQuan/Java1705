package com.situ.day20;

public class NumThread extends Thread{
	private int start;
	
	public NumThread(String name, int start ) {
		super(name);//给当前线程起一个名字
		this.start = start;
	}

	@Override
	public void run() {
		for (int i = start; i <= 100; i+=2) {
			//Thread.currentThread()当前正在执行的线程
			//Thread.currentThread().getName()当前正在执行的线程的名字
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}
