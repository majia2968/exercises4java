package com.myjava.sort;

public class BubbleSort {
	
	public void bubbleSort(int[] arr) {
		int length = arr.length;
		
		for (int m = length; m > 0; m--) {
			for (int n = 0; n < m - 1; n++) {
				if (arr[n] > arr[n+1]) {
					swap(n, n+1, arr);
				}
			}
		}
	}

	//swap the position of two integers
	public void swap(int x, int y, int[] arr) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
}


