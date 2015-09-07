package com.myjava.sort;

import java.util.Arrays;

public class SortP {

	public int[] quickSort(int left, int right, int[] arr) {

		if (left > right) {
			return arr;
		}

		int pivot = partition(left, right, arr);
		quickSort(left, pivot - 1, arr);
		quickSort(pivot + 1, right, arr);

		return arr;
	}

	public int partition(int left, int right, int[] arr) {
		int pivot = arr[left];
		int i = left;
		for (int j = left + 1; j <= right; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(i, j, arr);
			}
		}
		swap(left, i, arr);
		return left;
	}

	public void swap(int x, int y, int[] arr) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
	
	public int partition1(int left, int right, int[] arr) {
		int pivot = arr[right];
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				swap(left, right, arr);
				left++;
				right--;
			}
		}
		return right + 1;
	}
	
	public int[] quickSort1(int left, int right, int[] arr) {
		if (left > right) {
			return arr;
		}
		int tmp = partition1(left, right, arr);
		if ( left < tmp-1 ) quickSort1(left, tmp-1, arr);
		if ( tmp < right) quickSort1(tmp, right, arr);
		return arr;
	}
	
	public void insertionSort(int[] arr) {
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			for(int j = i -1; j >= 0; j--) {
				if (arr[j] > arr[i]) { 
					swap(i, j ,arr);
					i--;
				}
			}
		}
	}


	public static void main(String[] args) {
		SortP sp = new SortP();
		// int[] arr = {5,3,21,2,43,4,33,12,3};
		int[] arr = { 7, 8, 4, 9, 10, 3, 7, 1, 7 };
		int[] arr1 = {34,4,65,24,17,43,6,45,4,24,35};
		// sp.partition(0, 8, arr);
//		sp.quickSort1(0, 8, arr);
//		sp.quickSort1(0, 10, arr1);
		sp.insertionSort(arr1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
//		sp.quickSort(0, 8, arr);
		
		
	}
}