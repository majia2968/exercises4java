package com.myjava.sort;

public class QuickSort {

	int[] arr;

	public void quickSort(int left, int right) {
		
		if (arr == null || arr.length == 0)
			return;
 
		if (left >= right)
			return;
		
		int pivot = right;
		int index = partition(left, right, pivot);

		if (left < index - 1) quickSort(left, index - 1);
		if (index < right) quickSort(index, right);

	}

	public void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public int partition(int left, int right, int pivot) {
		while (left <= right) {
			while (arr[left] < arr[pivot]) {
				left++;
			}
			while (arr[right] > arr[pivot]) {
				right--;
			}
			if (left <= right) {
				swap(left, right);
				left++;
				right--;
			}
		}
		return right+1;
	}
}
