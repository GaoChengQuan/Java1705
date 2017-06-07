package com.situ.day20;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HomeWork {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("ios");
		list.add("php");
		String[] array = toArray(list);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * 1、获取一个字符串在另一个字符串中出现的次数。
         "abkkcdkkefkkskk"      
         "kk"
	 */
	@Test
	public void test() {
		String str = "abkkcdkkefkkskksdgukk";
		//String str = "    ";
		String key = "kk";
		int count = 0;
		int index = 0;
		while ((index = str.indexOf(key, index)) != -1) {
			count++;
			index = index + key.length();
		}
		System.out.println(count);
	}
	
	/**
	 * 实现函数public String[] toArray(List list)，其中参数list中元素类型为String字符串。
	 * 
	 */
	public static String[] toArray(List list) {
		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = (String) list.get(i);
		}
		
		return array;
	}
	
}
