package com.myjava.pro;

public class MyArray {

	int sum = 0;
	int halfSum = 0;
	int middle = 0;
	
	public int findMiddlePoint(int[] arr) throws Exception {
		
		for (int e : arr) sum += e;
		
		for (int j : arr) {
			halfSum += j;
			if (halfSum == (sum/2)) {
				return middle = j;
			}
		}
		return 0;
	}

}
