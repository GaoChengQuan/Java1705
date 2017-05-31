package com.situ.day15;

import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的数量：");
		int count = scanner.nextInt();
		Student[] studentArray = new Student[count];
		//初始化学生数组
		inputStudentsInfo(studentArray);
		//打印所有学生信息
		printStudentArray(studentArray);
		//根据条件查询学生信息
		searchStudentByCondition(studentArray);
	}

	private static void searchStudentByCondition(Student[] studentArray) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("----------");
			System.out.println("根据条件查询学生信息：");
			System.out.println("根据姓名来查询：1");
			System.out.println("根据年龄来查询：2");
			System.out.println("根据性别来查询：3");
			System.out.println("退出：0");
			System.out.println("----------");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("退出程序");
				break;
			}
			
			switch (type) {
			case 1://根据姓名来查询
				System.out.println("请输入要查询的姓名");
				String name = scanner.next();
				searchByName(studentArray, name);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * 查询数组中是够有指定名字的Student
	 * @param studentArray
	 * @param name
	 */
	private static void searchByName(Student[] studentArray, String name) {
		//是否通过名字搜索查找到 = false（初始化false就是没有查找到的意思）
		boolean isSearchByNameFound = false;
		for (int i = 0; i < studentArray.length; i++) {
			Student student = studentArray[i];
			if (name.equals(student.getName())) {
				printStudent(student);
				isSearchByNameFound = true;
			}
		}
		if (isSearchByNameFound == false) {
			System.out.println("没有该姓名的学生");
		}
	}

	/**
	 * 初始化学生数组
	 * @param scanner
	 * @param studentArray
	 */
	private static void inputStudentsInfo(Student[] studentArray) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < studentArray.length; i++) {
			Student student = new Student();
			System.out.println("请输入姓名：");
			String name = scanner.next();
			System.out.println("请输入性别：");
			char gender = scanner.next().charAt(0);
			System.out.println("请输入年龄：");
			int age = scanner.nextInt();
			student.setName(name);
			student.setAge(age);
			student.setGender(gender);
			
			studentArray[i] = student;
		}
	}

	private static void printStudentArray(Student[] studentArray) {
		for (int i = 0; i < studentArray.length; i++) {
			Student stu = studentArray[i];
			printStudent(stu);
		}
	}

	private static void printStudent(Student stu) {
		System.out.println("----------");
		System.out.println("姓名：" + stu.getName());
		System.out.println("性别：" + stu.getGender());
		System.out.println("年龄：" + stu.getAge());
		System.out.println("----------");
	}
}
