package com.myjava.sort;

import java.util.Arrays;

public class SortP {
	
	public int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr.length-1; j++) {
				int k = j + 1;
				if (arr[j] > arr[k]) {
					System.out.println(arr[j]);
					swap(j, k, arr);
					System.out.println(arr[j]);
				}
			}
		}
		return arr;
	}
	
	public void swap(int x, int y, int[] arr) {
		 int temp = arr[x];
	     arr[x] = arr[y];
	     arr[y] = temp;
	}
	
    public static void main(String[] args) {
        
    	SortP sp = new SortP();
        int[] arr = {12, 54, 36, 8, 10, 152, 124, 16,4,11,16};
//        System.out.println("Bubble Sort: "+Arrays.toString(sp.bubbleSort(arr)));
//        sp.partition(0, 8, arr);
        System.out.println("quick sort: "+Arrays.toString(arr));
//        System.out.println("quick sort: "+Arrays.toString(sp.quickSort(0, 10, arr)));
        sp.quickSort2(0, 10, arr);
        
//        System.out.println(sp.partition2(0, 10, arr));
        System.out.println("quick sort: "+Arrays.toString(arr));
    }
    
    public int[] quickSort(int left, int right, int[] arr) {
    	if (left > right) {
    		return arr;
    	}
    	int i = partition(left, right, arr);
    	quickSort(left, i-1, arr);
    	quickSort(i+1, right, arr);
    	return arr;
    }
    
    public int partition(int left, int right, int[]arr) {
    	int pivot = arr[left];
    	int i = left;
    	
    	for(int j = left + 1; j <= right; j++) {
    		if (arr[j] <= pivot) {
    			i++;
    			swap(i, j, arr);
    		}
    	}
    	swap(left, i, arr);
    	return i;
    }
    
    public int[] quickSort2(int left, int right, int[] arr) {
    	if (left >= right) return arr;
    	int tmp = partition2(left, right, arr);
    	if(left < tmp-1) quickSort2(left, tmp-1, arr);
    	if(tmp < right) quickSort2(tmp, right, arr);
    	return arr;
    }
    
    public int partition2(int left, int right, int[] arr) {
    	int pivot = arr[right];
    	while (left <= right) {
    		while(arr[left] < pivot) {
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

}
 