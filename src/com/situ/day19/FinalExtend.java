package com.situ.day19;

//The type FinalExtend cannot subclass the final class FinalClass
public class FinalExtend extends FinalClass{
	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		//The final field FinalExtend.PI cannot be assigned
		//PI = 3.10;
	}
	
	//Cannot override the final method from FinalClass
	@Override
	public void finalMethod() {
		// TODO Auto-generated method stub
		super.finalMethod();
	}
}
