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
//        System.out.println("Bubble Sort: "+Arrays.toString(sp.bubbleSort(arr)));
//        System.out.println("Insertion Sort: "+Arrays.toString(sp.insertSort(arr)));
        sp.partition(0, 7, arr);
        System.out.println("partition: "+Arrays.toString(arr));

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
    
    public int[] quickSort(int start, int end, int[] arr) {
        if(start>=end){    //
        	         return arr;
        	    }
        partition(start, end, arr);
        QuikSort(arr,start,i-1);        //a[i] is the pivot now
        QuikSort(arr,i+1,end);
    	return arr;
    }
    
    public void partition(int start, int end, int[] arr) {
    	int pivot = start;
    	for (int i = start + 1; i <= end; i++) {
    		if (arr[i] < arr[pivot]) {
    			swap(i, pivot, arr);
    			pivot++;
    		}
    	}
    }
}
 