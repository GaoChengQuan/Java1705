package com.situ.day16;

import java.io.PrintWriter;

public class PersonTest {
	public static void main(String[] args) {
		Student student = new Student("zhangsan", 18, "Java1705");
		student.show();
		student.study();
		
		Teacher teacher = new Teacher("lisi", 30, 10000);
		teacher.show();
		
		Person person = new Student("zhansgan1", 18, "Java1705");
		person.show();
		//person.study();
		//instanceof
		if (person instanceof Student) {
			Student stu = (Student)person;
			stu.study();
		} else if (person instanceof Teacher) {
			Teacher tea = (Teacher) person;
			tea.teach();
		}
		
		
		
		Person personTeacher = new Teacher("lisi1", 30, 10000);
		personTeacher.show();
		
		print(student);
		print(teacher);
		//teacher student 后勤、教务、辅导员、司机、。。。。。
		
		//所有Person类的子类对象都可以作为printPerson的参数，这样我们只要写一个printPerson就可以打印
		//所有子类对象的信息。其实这里面就是使用了多态：Person person = student;
		printPerson(student);
		printPerson(teacher);
		
	}
	
	private static void printPerson(Person person) {
		System.out.println("------");
		System.out.println(person.name);
		System.out.println(person.age);
		person.show();
	}
	
	private static void print(Teacher teacher) {
		System.out.println(teacher.name);
		System.out.println(teacher.age);
	}
	
	private static void print(Student student) {
		System.out.println(student.name);
		System.out.println(student.age);
	}
	//如果有多个子类的话，需要写多个重载的的print方法。
	private static void print(后勤 hq) {
		System.out.println(hq.name);
		System.out.println(hq.age);
	}
}
