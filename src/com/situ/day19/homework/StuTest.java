package com.situ.day19.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 完善学生信息输入的的例子： 1、录入学生信息 2、展示录入的所有学生信息 3、输出如下查询信息 根据条件查询学生信息： 根据姓名查询 ：1 根据年龄查询
 * ：2 根据性别查询 ：3 退出：0 （除非用户输入0，否则一直可以查询。 ） 4、根据输入的条件查询学生的信息，将学生的信息打印出来。
 * 
 * @author Gao
 * 
 */
public class StuTest {
	public static void main(String[] args) {
		List<Stu> list = new ArrayList<Stu>();
		//创建学生对象添加到传入的List集合中
		intputStuInfos(list);
		//打印所有学生信息
		printStuInfos(list);
		//通过条件查询学生信息
		searchStuInfosByCondition(list);
	}

	/**
	 * 通过条件查询学生信息
	 * @param list
	 */
	private static void searchStuInfosByCondition(List<Stu> list) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("---------------");
			System.out.println("根据条件查询学生信息：");
			System.out.println("根据姓名查询 ：1");
			System.out.println("根据年龄查询 ：2");
			System.out.println("根据性别查询 ：3");
			System.out.println("退出：0 ");
			System.out.println("---------------");
			int type = scanner.nextInt();
			
			if (type == 0) {
				System.out.println("程序退出！");
				break;
			}
			
			switch (type) {
			case 1://根据姓名查询 
				System.out.println("请输入要查询的姓名：");
				String name = scanner.next();
				searchByName(list, name);
				break;
			case 2://根据年龄查询 
				System.out.println("请输入要查询的年龄：");
				int age = scanner.nextInt();
				searchByAge(list, age);
				break;
			case 3://根据性别查询 
				System.out.println("请输入要查询的性别：");
				char gender = scanner.next().charAt(0);
				searchByGender(list, gender);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * 通过性别查找学学生
	 * @param list 要查询的集合
	 * @param gender 要查询的性别
	 */
	private static void searchByGender(List<Stu> list, char gender) {
		boolean isSearchByGenderFound = false;
		for (Stu stu : list) {
			if (gender == stu.getGender()) {
				System.out.println(stu);
				isSearchByGenderFound = true;
			}
		}
		if (isSearchByGenderFound == false) {
			System.out.println("没有该姓名学生");
		}
	}

	/**
	 * 通过年龄查找学学生
	 * @param list 要查询的集合
	 * @param gender 要查询的年龄
	 */
	private static void searchByAge(List<Stu> list, int age) {
		boolean isSearchByAgeFound = false;
		for (Stu stu : list) {
			if (age == stu.getAge()) {
				System.out.println(stu);
				isSearchByAgeFound = true;
			}
		}
		if (isSearchByAgeFound == false) {
			System.out.println("没有该姓名学生");
		}
	}

	/**
	 * 通过姓名查找学学生
	 * @param list 要查询的集合
	 * @param gender 要查询的姓名
	 */
	private static void searchByName(List<Stu> list, String name) {
		//通过名字查找到没有
		boolean isSearchByNameFound = false;
		for (Stu stu : list) {
			if (name.equals(stu.getName())) {
				System.out.println(stu);
				isSearchByNameFound = true;
			}
		}
		if (isSearchByNameFound == false) {
			System.out.println("没有该姓名学生");
		}
	}

	/**
	 * 打印所有学生信息
	 * @param list
	 */
	public static void printStuInfos(List<Stu> list) {
		for (Stu stu : list) {
			System.out.println(stu);
		}
	}
	
	/**
	 * 创建学生对象添加到传入的List集合中
	 * @param list
	 */
	private static void intputStuInfos(List<Stu> list) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入姓名:");
			String name = scanner.next();
			System.out.println("请输入年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入性别：");
			char gender = scanner.next().charAt(0);
			
			Stu stu = new Stu(name, age, gender);
			list.add(stu);
			System.out.println("是否结束输入?0结束");
			int result = scanner.nextInt();
			if (result == 0) {
				break;
			}
		}
	}
}
