package com.situ.day17;
/**
 * 数组操作的工具类
 * @author Gao
 *
 */
public class ArrayUtil {

	//构造方法私有，不需要外界new对象
	private ArrayUtil() {}
	
	/**
	 * 求数组中的最大值
	 * @param array 整数类型的数组
	 * @return 数组中的最大值
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	/**
	 * 冒泡排序
	 * @param array 要排序的整型数组
	 */
	public static void bubbleSort(int[] array) {
		// i=1, i=2, i=3
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
