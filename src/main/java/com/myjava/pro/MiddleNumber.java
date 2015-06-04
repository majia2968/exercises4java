package com.myjava.pro;

public class MiddleNumber {
	
	public int findMiddleNumber(int[] arr) throws Exception {
		int startIndex = 0;
		int endIndex = arr.length - 1;
		int leftSum = 0;
		int rightSum = 0;
		
		while (true) {
			if (leftSum > rightSum) {
				rightSum += arr[endIndex--];
			}
			else {
				leftSum += arr[startIndex++];
			}
			
			if (startIndex > endIndex) {
				if (leftSum == rightSum) {
					break;
				}
				else {
					throw new Exception("Please pass proper array to match the requirement");
				}
			}
		}
		return endIndex;
	}
}
