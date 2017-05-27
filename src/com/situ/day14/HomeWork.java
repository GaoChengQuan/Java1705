package com.situ.day14;

import org.junit.Test;

public class HomeWork {
	public static void main(String[] args) {
		int[] array = new int[] { 8, 17, 19, 37, 40, 73, 79, 82, 87, 95, 97, 98 };
		int target = 95;
		int index = binarySearch(array, target);
		System.out.println(index);
	}

	/**
	 * 二分查找：要查找的元素在数组中下标，没有找到返回-1
	 * @param array 要查找的数组
	 * @param target 要查找的元素
	 * @return 要查找的元素在数组中下标，没有找到返回-1
	 */
	private static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) / 2;
		
		while (low <= high) {
			if(array[mid] == target) {
				return mid;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else if (array[mid] < target) {
				low = mid + 1;
			}
			
			mid = (low + high) / 2;
		}
		
		return -1;
	}
	
	/**
	 * 2、定义功能，用于打印数组中的元素。元素间用逗号隔开。
		int[] arr = new int[]{10, 5, 7};
		要求打印结果：[10, 5, 7]
	 */
	@Test
	public void test() {
		int[] arr = new int[]{10, 5, 7};
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	/**
		*   
	   * *
	  * * *
	 * * * *
	* * * * *
	 */
	@Test
	public void test1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
