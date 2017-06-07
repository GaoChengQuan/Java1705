package com.situ.day19.homework;

import java.util.Arrays;

import org.junit.Test;

public class HomeWork {

	/**
	 * 2、现在有如下的一个数组：
		  int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
		  要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
		  int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
		思路：生活中的问题解决 = 程序中的解决；
		  1、 确定出不为0的个数，这样可以开辟新数组；
		  2、 从旧的数组之中，取出内容，并将其赋给新开辟的数组；
	 */
	@Test
	public void test() {
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int count = 0;
		for (int i = 0; i < oldArr.length; i++) {
			if (oldArr[i] == 0) {
				count++;
			}
		}
		int[] newArr = new int[oldArr.length - count];
		int index = 0;
		for (int i = 0; i < oldArr.length; i++) {
			if (oldArr[i] != 0) {
				newArr[index++] = oldArr[i];
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
	
	/**
	 * 3、
		现在给出两个数组：
		  · 数组A：“1，7，9，11，13，15，17，19：；
		  · 数组b：“2，4，6，8，10”
		  0 0 0 0 0 0 。。。                       0 0 0  0
		  1，7，9，11，13，15，17，19，2，4，6，8，10
		  两个数组合并为数组c，按升序排列。
		  1.计算数组c的长度，a的长度+b的长度
		  2.先把a数组复制到数组c，然后再把b复制到数组c
	 */
	@Test
	public void test1() {
		int[] arrA = new int[]{1, 7, 9, 11, 13, 15, 17, 19};
		int[] arrB = new int[]{2, 4, 6, 8, 10};
		//0 0 0 0 0 0 0 0 0 0 0 0 0 
		int[] newArr = new int[arrA.length + arrB.length];
		
		//1 7 9 11 13 15 17 19 0 0 0 0 0 
		System.arraycopy(arrA, 0, newArr, 0, arrA.length);
		//1 7 9 11 13 15 17 19 2 4 6 8 10 
		System.arraycopy(arrB, 0, newArr, arrA.length, arrB.length);
		
		Arrays.sort(newArr);
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
	
}
