package com.situ.day15;

import org.apache.taglibs.standard.lang.jstl.GreaterThanOperator;
import org.junit.Test;

public class OOPDemo {
	public static void main(String[] args) {
		String name = "zhangsan";
		int age = 18;
		char gender = '男';
		String className = "Java1705";
		double grade = 90;
		
		printStudent(name, age, gender, className, grade);
		/*printStudent(name, age, gender, className);
		printStudent(name, age, gender, className);
		printStudent(name, age, gender, className);
		printStudent(name, age, gender, className);
		printStudent(name, age, gender, className);*/
	}

	private static void printStudent(String name, int age, char gender,
			String className, double grade) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(className);
		System.out.println(grade);
		
	}
	
	@Test
	public void test1() {
		int num = 3;
		int[] nums = new int[3];
		Student1[] students = new Student1[3];
		
		Student1 student = new Student1();
	    //The field Student.name is not visible
		student.name = "zhangsan";
		student.age = 180;
		student.gender = '男';
		student.className = "Java1705";
		student.grade = 90;
		
		student.print();
		student.study();
		
		//printStudent(student);
	}

	public void study(Student1 student) {
		System.out.println(student.className + " 的 " + student.name + "正在学习");
	}
	
	private void printStudent(Student1 student) {
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.gender);
		System.out.println(student.className);
		System.out.println(student.grade);
	}
	
	@Test
	public void test2() {
		Student1 student1 = new Student1();
		student1.setName("zhangsan");
		student1.setAge(18);
		
		Student1 student2 = new Student1();
		student2.setName("lisi");
		student2.setAge(20);
		
		Student1 student3 = new Student1("wangwu", 18, '男', 45, "Java1705");
		student3.study();
	}

}
