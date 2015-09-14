package com.myjava.sort;

public class MergeSort {
	private int[] arr;
	private int[] tmpArr;
	private int number;

	public void mergeSort(int[] arr) {
		int low = 0;
		this.arr = arr;
		number = arr.length;
		this.tmpArr = new int[number];
		doMergeSort(0, number - 1);
	}

	public void doMergeSort(int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			doMergeSort(low, middle);
			doMergeSort(middle + 1, high);
			mergeParts(low, middle, high);
		}

	}

	public void mergeParts(int low, int middle, int high) {
		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			tmpArr[i] = arr[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
		while (i <= middle && j <= high) {
			if (tmpArr[i] <= tmpArr[j]) {
				arr[k] = tmpArr[i];
				i++;
			} else {
				arr[k] = tmpArr[j];
				j++;
			}
			k++;
		}
		 // Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			arr[k] = tmpArr[i];
			k++;
			i++;
		}
	}

}
