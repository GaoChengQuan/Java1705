package com.situ.day16;

public class CalTest {
	public static void main(String[] args) {
		//多态：声明父类类型，new的是子类类型，调用getResult方法，如果子类覆盖了getResult，
		//那么调用的就是子类覆盖后的方法，如果子类没有覆盖getResult，那么调用的是父类的方法。
		Cal addCal = new Add(3, 5);
		int addResult = addCal.getResult();
		System.out.println(addResult);
		
		Cal subCal = new Sub(3, 5);
		int subResult = subCal.getResult();
		System.out.println(subResult);
	}
	
}
