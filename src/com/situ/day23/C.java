package com.situ.day23;

public class C extends B implements A {
	public void pX() {
		//The field x is ambiguous
		System.out.println(x);
	}

	public static void main(String[] args) {
		new C().pX();
	}

}
