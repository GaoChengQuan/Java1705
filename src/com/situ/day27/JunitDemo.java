package com.situ.day27;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JunitDemo {
	@Before
	public void beforePrint() {
		System.out.println("before");
	}
	
	@Test
	public void print1() {
		System.out.println("print1");
	}

	@Test
	public void print2() {
		System.out.println("print2");
	}
	
	@After
	public void afterPrint() {
		System.out.println("after");
	}
}
