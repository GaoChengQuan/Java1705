package com.situ.day16;

public class Student extends Person {
	private String className;

	public Student() {
		super();
	}

	public Student(String name, int age, String className) {
		super(name, age);
		this.className = className;
	}
	
	@Override
	public void show() {
		System.out.println("name: " + name + ", age: " + age + ", className:" + className);
	}
	
	public void study() {
		System.out.println(name + "正在学习");
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
