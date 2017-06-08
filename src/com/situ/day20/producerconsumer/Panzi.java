package com.situ.day20.producerconsumer;

import java.util.LinkedList;

public class Panzi {
	private LinkedList<Cake> linkedList = new LinkedList<Cake>();
	
	public synchronized void putCake(Cake cake) {
		linkedList.addLast(cake);//linkedList.add(cake);
		System.out.println("putCake notifyAll");
		notifyAll();
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
