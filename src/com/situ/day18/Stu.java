package com.situ.day18;

public class Stu {
	private String name;
	private int age;

	public Stu() {
		super();
	}

	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		return "Stu [name=" + name + ", age=" + age + "]";
	}

}
