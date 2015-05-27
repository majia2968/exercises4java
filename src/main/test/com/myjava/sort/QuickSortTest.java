package com.myjava.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void test() {
		QuickSort qs = new QuickSort();
		int[] arr = {4,3,6,7,4,34,23,54,343,36,41,56};
		qs.arr = arr;
		qs.quickSort(0, 11);
		int[] expected_array = {3, 4, 4, 6, 7, 23, 34, 36, 41, 54, 56, 343};
		assertArrayEquals(arr, expected_array);
	}

}
