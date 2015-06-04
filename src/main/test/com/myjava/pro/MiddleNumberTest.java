package com.myjava.pro;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiddleNumberTest {

	@Test
	public void test() throws Exception {
		int[] arr = {1,3,5,7,8,8};
	
		MiddleNumber mn = new MiddleNumber();
		assertEquals(mn.findMiddleNumber(arr), 3);
		assertEquals(mn.findMiddleNumber(arr), 3);

	}
	
	@Test
	public void testException() throws Exception {
		int[] arr = {1,3,5,7,8,5};	
		MiddleNumber mn = new MiddleNumber();
		
	    try {
			assertEquals(mn.findMiddleNumber(arr), 3);
	    } catch (Exception e) {
	        assertEquals("Please pass proper array to match the requirement", e.getMessage());
	    }

	}

}
