package com.situ.day16;

public class Teacher extends Person {

	private double salary;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	
	public void teach() {
		System.out.println(name + "正在教学");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
