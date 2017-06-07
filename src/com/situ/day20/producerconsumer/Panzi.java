package com.situ.day20.producerconsumer;

import java.util.LinkedList;

public class Panzi {
	private LinkedList<Cake> linkedList = new LinkedList<Cake>();
	
	public synchronized void putCake(Cake cake) {
		linkedList.addLast(cake);
		notifyAll();
		System.out.println("putCake notifyAll");
	}
	
	public synchronized Cake getCake() {
		if (linkedList.size() <= 0) {
			try {
				System.out.println("getCake wait");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Cake cake = linkedList.removeFirst();
		return cake;
	}
}
