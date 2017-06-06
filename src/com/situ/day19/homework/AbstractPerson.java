package com.situ.day19.homework;

public abstract class AbstractPerson {
	protected String name;
	protected int age;

	protected AbstractPerson() {
		super();
	}

	protected AbstractPerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract void show();

}
