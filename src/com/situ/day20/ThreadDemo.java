package com.situ.day20;

import org.junit.Test;

public class ThreadDemo {
	public static void main(String[] args) {
		NumThread oddNumThread = new NumThread("奇数线程", 1);
		oddNumThread.start();
		NumThread eveNumThread = new NumThread("偶数线程", 2);
		eveNumThread.start();
	}
	
}
