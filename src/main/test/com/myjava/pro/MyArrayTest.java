package com.myjava.pro;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayTest {

	@Test
	public void test() throws Exception {
		int[] arr = {1,4,7,3,2,5,8};
		MyArray myArray = new MyArray();
		assertEquals(myArray.findMiddlePoint(arr), 3);
	}

}
