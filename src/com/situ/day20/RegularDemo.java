package com.situ.day20;

import org.junit.Test;

public class RegularDemo {
	@Test
	public void testMatch() {
		//boolean java.lang.String.matches(String regex)
		//根据指定的正则表达式验证当前字符串是否满足指定的规则，
		//满足条件返回true，不满足返回false。
		//  (\.[a-zA-Z0-9_]+)+
		String regex = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)+";
		String mail = "-78sadfg_u@yusd_.com.cn.gov.123";
		if (mail.matches(regex)) {
			System.out.println("是邮箱");
		} else {
			System.out.println("不是邮箱");
		}
	}
	
	@Test
	public void testSplit() {
		//String[] java.lang.String.split(String regex)
		//将指定的字符串按照满足正则表达式的部分进行
		// "Java Android 1705"
		
		//String regex = "[0-9]+";
		//String regex = "\\d+";
		String regex = "\\d*23";//要求这个数字最后以23结尾
		String str = "sdewr7823shdhAS3dfhodf123hl";
		String[] array = str.split(regex);
		for (String string : array) {
			System.out.println(string);
		}
		
		//String[] array = {"sdewr", "shdhAS", "dfhodf", "hl"}
	}
	
	@Test
	public void testReplace() {
		//String java.lang.String.replaceAll(String regex, String replacement)
		//当前字符串满足正则表达式的部分替换为给定的字符串
		// #NUMBER#
		String str = "sdh23sbdkjgk3434hsdh545jdlfj89";
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}
}
