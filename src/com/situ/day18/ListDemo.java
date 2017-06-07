package com.situ.day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		
		
		Stu stu1 = new Stu("zhangsan", 18);
		Stu stu2 = new Stu("lisi", 20);
		Stu stu3 = new Stu("wangwu", 21);
		Teacher teacher = new Teacher();
		
		Stu[] stus = new Stu[3];
		stus[0] = stu1;
		stus[1] = stu2;
		stus[2] = stu3;
		
		for (Stu stu : stus) {
			System.out.println(stu);
		}
		System.out.println("-----------");
		
		// 程序=算法+数据结构
		// 数据结构解决长度固定问题？List
		// 解决List里面数据类型不固定问题？泛型（表示集合里面只能放这种类型）
		// 集合做主要的操作就是：增删改查+遍历

		//加了泛型之后，list里面只能存放Stu类型
		List<Stu> list = new ArrayList<Stu>();
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu1);
		//The method add(Stu) in the type List<Stu> is not applicable for the arguments (Teacher)
		//加了泛型之后，list里面只能存放Stu类型
		//list.add(teacher);
		//list.add(new int[3]);
		
		//index of the element to return，和数组的下标处理是一样的
		Stu s = list.get(0);
		
		//遍历的三种方式：
		//1.数组的方式
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//2.foreach方式
		//Type mismatch: cannot convert from element type Object to Stu
		//Object[] elementData
		for (Stu stu : list) {
			System.out.println(stu + "----");
		}
		
		//3.迭代器Iterator
		Iterator<Stu> iterator = list.iterator();
		while (iterator.hasNext()) {
			Stu stu = iterator.next();
			System.out.println(stu);
		}
	}
}
