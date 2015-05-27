package com.myjava.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class InsertSortTest {

	@Test
	public void test() {
		InsertSort is = new InsertSort();
		int[] arr = {34,23,54,2,4,65,5,33,23};
		int[] expected_array = {2, 4, 5, 23, 23, 33, 34, 54, 65};
		is.insertSort(arr);
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(arr, expected_array);
	}

}
