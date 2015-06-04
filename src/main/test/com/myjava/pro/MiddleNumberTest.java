package com.myjava.pro;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
public class MiddleNumberTest {

	@Test
	public void test() throws Exception {
		int[] arr = {1,3,5,7,8,8};
	
		MiddleNumber mn = new MiddleNumber();
		assertThat(mn.findMiddleNumber(arr), is(3));
	}
	
	@Test
	public void testException() throws Exception {
		int[] arr = {1,3,5,7,8,5};	
		MiddleNumber mn = new MiddleNumber();
		
	    try {
			assertThat(mn.findMiddleNumber(arr), is(3));
	    } catch (Exception e) {
	        assertThat("Please pass proper array to match the requirement", is(e.getMessage()));
	    }

	}

}
