package com.situ.day23;

import java.util.LinkedList;

public class MyStack implements MyStringStackIFC{
	private LinkedList<String> list = new LinkedList<String>();

	public String pop() {
		if (list.size() == 0) {
			return null;
		}
		
		return list.removeLast();
	}

	public void push(String str) {
		list.addLast(str);
	}
}
