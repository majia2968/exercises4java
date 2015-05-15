package com.myjava.pro;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
	Set<Integer> tmpSet = new HashSet<Integer>();

	public void findDuplicateNumber(int[] arr) {
		for (Integer i : arr) {
			if (!tmpSet.add(i)) {
				System.out.println("Duplicate number is: " + i);
			}
		}
	}
	
	public String toString() {
		return tmpSet.toString();
	}

}
