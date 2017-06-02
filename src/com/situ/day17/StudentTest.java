package com.situ.day17;

import org.junit.Test;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("zhansgan", 18, "CN");
		Student student2 = new Student("lisi", 20, "CN");
		System.out.println(student1.getCountry());
		System.out.println(student2.getCountry());
		
		System.out.println(Student.country);
		
		Student.show();
	}
	
	@Test
	public void test1() {
		Student student = new Student("zhangsan", 18);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		System.out.println(student.toString());
		System.out.println(student);
	}
	
	
}
