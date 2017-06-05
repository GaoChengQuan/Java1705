package com.situ.day18.homework;

public class Animal {
	protected String name;
	protected int age;

	public Animal() {
		super();
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
			System.out.println("Animal::showInfo()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

}
