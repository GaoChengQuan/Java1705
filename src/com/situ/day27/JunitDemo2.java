package com.situ.day27;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo2 {
	@BeforeClass
	public static void beforePrint() {
		System.out.println("BeforeClass");
	}
	
	@Test
	public void print1() {
		System.out.println("print1");
	}

	@Test
	public void print2() {
		System.out.println("print2");
	}
	
	@AfterClass
	public static void afterPrint() {
		System.out.println("AfterClass");
	}
}
