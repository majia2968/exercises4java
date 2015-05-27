package com.myjava.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void test() {
		SelectionSort ss = new SelectionSort();
		int[] arr = {10,34,2,56,7,67,88,42};
		int[] expected_array = {2, 7, 10, 34, 42, 56, 67, 88};
		ss.selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(arr, expected_array);
	}

}
