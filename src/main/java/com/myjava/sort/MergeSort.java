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
		for (int i = low; i <= high; i++) {
			tmpArr[i] = arr[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
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
		while (i <= middle) {
			arr[k] = tmpArr[i];
			k++;
			i++;
		}
	}

}
