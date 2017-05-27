package com.situ.day13;

public class HomeWork {
	public static void main(String[] args) {
		int target = 95;
		int[] array = new int[] { 8, 17, 19, 37, 40, 73, 79, 82, 87, 95, 97, 98 };
		int index = binarySearch(array, target);
		System.out.println(index);
	}

	public static int binarySearch(int array[], int target) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
