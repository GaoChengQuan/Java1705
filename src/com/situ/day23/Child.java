package com.situ.day23;

public class Child extends Parent {

	protected String value = "456";
	
//	@Override
//	public String getValue() {
//		return value;
//	}

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.getValue());
		;
	}
	
	public void show() {
		System.out.println(value);
	}

}
