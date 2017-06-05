package com.situ.day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Stu stu1 = new Stu("zhangsan", 18);
		Stu stu2 = new Stu("lisi", 20);
		Stu stu3 = new Stu("wangwu", 21);
		//Set里面的元素不能重复
		Set<Stu> set = new HashSet<Stu>();
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu1);
		
		for (Stu stu : set) {
			System.out.println(stu);
		}
	}
}
