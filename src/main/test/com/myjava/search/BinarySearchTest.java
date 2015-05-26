package com.myjava.search;


import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testBinarySearch() {
		BinarySearch bs = new BinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

		assertEquals(bs.binarySearch(arr, 14), 6);
		
	}

}
