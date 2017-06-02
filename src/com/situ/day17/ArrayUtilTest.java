package com.situ.day17;

import org.junit.Test;

public class ArrayUtilTest {
	
	@Test
	public void maxTest() {
		int[] array = new int[]{23, 12, 45, 6};
		int max = ArrayUtil.max(array);
		System.out.println(max);
	}
	
	@Test
	public void bubbleSortTest() {
		int[] array = new int[]{23, 12, 45, 6};
		ArrayUtil.bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
