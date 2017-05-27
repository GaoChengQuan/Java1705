package com.situ.day14;

public class ArrayReverse {
	public static void main(String args[]) {
		//在开发的时候主方法之中的代码越少越好。
		int[] array = new int[] {23, 12, 3, 4, 55, 16};
		printArray(array);
		reverse(array);
		System.out.println();
		printArray(array);
	}

	private static void reverse(int[] array) {
		int center = array.length / 2;
		int head = 0;
		int tail = array.length - 1;
		
		for (int i = 0; i < center; i++) {
			int temp = array[tail];
			array[tail] = array[head];
			array[head] = temp;
			
			head++;
			tail--;
		}
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
