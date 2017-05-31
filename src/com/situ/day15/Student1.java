package com.situ.day15;

public class Student1 {
	//成员属性
	private String name;
	private int age;
	private char gender;
	private double grade;
	private String className;
	
	public Student1() {
	}

	public Student1(String name, int age, char gender, double grade,
			String className) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.grade = grade;
		this.className = className;
	}
	
	public Student1(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	//方法
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//student1.name = name;
		//student2.name = name;
		this.name = name;
	}
	
	/*public void setName(String name) {
		//The assignment to variable name has no effect
		//就近原则
		//name = name;
		this.name = name;
	}*/
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 0 || age > 120) {
			age = 0;
		} else {
			this.age = age;
		}
	}
	
	public void setGender(char gender) {
		if (gender == '男' || gender == '女') {
			this.gender = gender;
		} else {
			this.gender = '男';
		}
	}
	
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public char getGender() {
		return gender;
	}

	public void study() {
		System.out.println(className + " 的 " + name + "正在学习");
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(className);
		System.out.println(grade);
	}
}
