package com.situ.day23;

public class HomeWork2 {

	/**
	 * 利用LinkedList 编写一个用于存取字符串的堆栈类MyStringStack，
	 * 它实现了以下MyStringStackIFC接口： 
	 */
	public static void main(String[] args) {
		MyStringStackIFC stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.pop());//C
		System.out.println(stack.pop());//B
		System.out.println(stack.pop());//A
		System.out.println(stack.pop());//null
	}
}
