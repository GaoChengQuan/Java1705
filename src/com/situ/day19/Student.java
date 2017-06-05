package com.situ.day19;

public class Student extends AbstractPerson implements IFly{
	private String className;

	@Override
	public void walk() {
		System.out.println("Student::walk");
	}

	@Override
	public void showInfo() {
		System.out.println("Student::showInfo");
	}
	
	public void study() {
		System.out.println("Student::study");
	}

	public void fly() {
		
	}
}
