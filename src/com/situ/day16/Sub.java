package com.situ.day16;

public class Sub extends Cal{

	public Sub() {
		super();
	}

	public Sub(int num1, int num2) {
		super(num1, num2);
	}
	
	@Override
	public int getResult() {
		return num1 - num2;
	}

	
}
