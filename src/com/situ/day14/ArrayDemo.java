package com.situ.day14;

import java.util.Arrays;

import org.junit.Test;


public class ArrayDemo {
	public static void main(String[] args) {
		int[] src = {10, 20, 30, 40, 50};
		int[] dest = new int[6];
		//Parameters:
		//src the source array. 源数组
		//srcPos starting position in the source array.源数组中起始位置
		//dest the destination array. 目标数组
		//destPos starting position in the destination data.目标数组中起始位置
		//length the number of array elements to be copied.要复制的数组元素的数量

		System.arraycopy(src, 1, dest, 0, 4);
		printArray(dest);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	@Test
	public void arraysCopyOf() {
		int[] src = {10, 20, 30, 40, 50};
		int[] copy = Arrays.copyOf(src, src.length + 3);
		printArray(copy);
	}
}
