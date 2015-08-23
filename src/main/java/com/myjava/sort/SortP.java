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
        int[] arr = {12, 54, 36, 8, 10, 152, 124, 16};
        System.out.println("Bubble Sort: "+Arrays.toString(sp.bubbleSort(arr)));
        System.out.println("Insertion Sort: "+Arrays.toString(sp.insertSort(arr)));
    }
    
    public int[] insertSort(int[] arr) {
    	for (int i = 1; i < arr.length; i++) {
    		for (int j = i; j > 0; j--) {
    			int k = j - 1;
    			if (arr[k] > arr[j]) {
					swap(j, k, arr);    				
    			}
    		}
    	}
    	return arr;
    }
    
    public int[] quickSort(int[] arr) {
    	
    	return arr;
    }

}
 