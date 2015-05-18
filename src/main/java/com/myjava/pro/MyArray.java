package com.myjava.pro;

public class MyArray {

	int sum = 0;
	int halfSum = 0;
	int middle = 0;
	
	public int findMiddlePoint(int[] arr) throws Exception {
		
		for (int i  : arr) {
			sum += i;
		}
		
		System.out.println(sum);
		
		for (int j : arr) {
			halfSum += j;
			if (halfSum == (sum-j)/2) {
				middle = j;
			}
			else {
				System.out.println("Not found number in the array");
				middle = 0;
			}
		}
		return middle;
	}

}
