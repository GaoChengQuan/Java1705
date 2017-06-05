package com.situ.day18.homework;

public class Student extends Person {

	private String className;

	public Student() {
		super();
	}
	
	public void study() {
		System.out.println("Student::study()");
	}

	public Student(String className) {
		super();
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [className=" + className + "]";
	}

}
