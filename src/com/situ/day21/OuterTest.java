package com.situ.day21;

import com.situ.day21.Outer.Inner;

public class OuterTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		//(e.g. x.new A() where x is an instance of Outer)
		Inner inner = outer.new Inner();
		inner.show();
	}
}
