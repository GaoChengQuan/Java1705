package com.situ.day23.util;

import com.situ.day23.Paren;

public class Child extends Paren {
	public static void main(String[] args) {
		Paren tt = new Paren();
		tt.talk();
	}
	
	public void show() {
		talk();
	}
}
