package com.myjava.array;

import java.util.Arrays;

public class MyArray {
	
	int[] arr;
	
	public int[] reverse(int[] arr) {
		this.arr = arr;
		for (int i = 0; i < arr.length/2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
		}
		return arr;
	}
	
    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5,6,7};
    	MyArray myArray = new MyArray();
    	myArray.reverse(arr);
    	System.out.println(Arrays.toString(arr));
    }
    
}
