package com.myjava.sort;

public class SelectionSort {

	public void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int smallest = Integer.MAX_VALUE;
			int index = 0;
			for (int j = i; j < arr.length; j++) {
				if (smallest > arr[j]) {
					smallest = arr[j];
					index = j;
				}
			}
			swap(i, index, arr);
		}
	}
	
	public void swap(int x, int y, int[] arr) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
