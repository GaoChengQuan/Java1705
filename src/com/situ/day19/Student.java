package com.situ.day19;

public class Student {
	private String name;
	private int age;
	private EnumGender enumGender;

	public Student() {
		super();
	}

	public Student(String name, int age, EnumGender enumGender) {
		super();
		this.name = name;
		this.age = age;
		this.enumGender = enumGender;
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

	public EnumGender getEnumGender() {
		return enumGender;
	}

	public void setEnumGender(EnumGender enumGender) {
		this.enumGender = enumGender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", enumGender="
				+ enumGender.getValue() + "]";
	}

}
