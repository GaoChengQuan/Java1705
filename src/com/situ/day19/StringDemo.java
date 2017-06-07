package com.situ.day19;

import org.junit.Test;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//equals 比较字符串里面的值是不是相等
		if (str1.equals(str2)) {
			System.out.println("eqauls");
		}
		//==内存的地址是不是相等
		if (str1 == str2) {
			System.out.println("==");
		}
	}
	
	@Test
	public void test() {
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		
		System.out.println(str1 == str2);//false
		System.out.println(str1.equals(str2));//true
		System.out.println(str1 == str3);//true
	}
	
	@Test
	public void test1() {
		String str = "Java Android A1705";
		String str1 = "java Android A1705";
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf('A', 6));//13
		System.out.println(str.indexOf("An"));
		
		System.out.println(str.lastIndexOf('A'));//13
		
		if (str.equalsIgnoreCase(str1)) {
			System.out.println("equals");
		}
		
		System.out.println(str.contains("o"));
		
		System.out.println(str.startsWith("Java"));
		
		System.out.println(str.endsWith("705"));
		System.out.println(str.isEmpty());
		
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		String  str3 = new String(array);
		System.out.println(str3);
		
		String str4 = str.replace('A', 'B');
		System.out.println(str4);
		
		String[] strings = str.split(" ");
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 12));
		
		String str5 = "   Java  Android    ";
		System.out.println(str5.trim());
	}
	
	@Test
	public void trim() {
		String str = "   java android   ";
		int beginIndex = 0;
		int endIndex = str.length() - 1;
		//注意临界条件的判断，如果输入的字符串都是空格字符组成的这种临界条件
		while ((beginIndex <= endIndex) && (str.charAt(beginIndex) == ' ')) {
			beginIndex++;
		}
		while ((beginIndex <= endIndex) && (str.charAt(endIndex) == ' ')) {
			endIndex--;
		}
		String result = str.substring(beginIndex, endIndex + 1);
		System.out.println(result);
	}
	
	@Test
	public void test4() {
		String str = "Java Android 1705";
		
		String str1 = "java";
		String str2 = "ios";
		String str3 = "php";
		String str4 = "python";
		String str5 = "C++";
		String strResult = str1 + str2 + str3 + str4 + str5;
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(str1);
		stringBuffer.append(str2);
		stringBuffer.append(str3);
		stringBuffer.append(str4);
		stringBuffer.append(str5);
		System.out.println(stringBuffer);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(str1);
		stringBuilder.append(str2);
		stringBuilder.append(str3);
		stringBuilder.append(str4);
		stringBuilder.append(str5);
		System.out.println(stringBuilder);
		
		StringBuilder stringBuilder1 = new StringBuilder();
		//链式编程 this
		stringBuilder1.append(str1).append(str2).append(str3);
		System.out.println(stringBuilder1);
		
		
		//String<StringBuffer<StringBuilder
		
		String string = "java" + "ios" + "php" + "python"; 
	}
}
