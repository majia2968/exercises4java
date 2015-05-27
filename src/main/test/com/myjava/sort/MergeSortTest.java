package com.myjava.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void test() {
		int[] arr = {4,3,6,7,4,34,23,54,343,36,41,56};
		int[] expected_arr = {3, 4, 4, 6, 7, 23, 34, 36, 41, 54, 56, 343};
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(arr, expected_arr);
	}

}
