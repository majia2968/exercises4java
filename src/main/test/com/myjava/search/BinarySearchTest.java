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
	
	@Test
	public void testRecursiveSearch() {
		BinarySearch bs = new BinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
		assertEquals(bs.recursiveSearch(arr,0,7,14), 6);
		assertEquals(bs.recursiveSearch(arr,0,7,16), 7);
		
	}

}
