package com.situ.day19.homework;

public abstract class AbstractStudent extends AbstractPerson{
	protected String className;

	protected AbstractStudent() {
		super();
	}

	protected AbstractStudent(String name, int age, String className) {
		super(name, age);
		this.className = className;
	}

	public abstract void study();
	
}
