package com.myjava.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test() {
		int[] arr = {5,3,5,6,13,43,25,35,3};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
