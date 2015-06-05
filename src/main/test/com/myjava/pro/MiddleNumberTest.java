package com.myjava.pro;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MiddleNumberTest {
	private MiddleNumber mn;
	private int[] arr;
	private int[] arr1;
	
	@Before
	public void setUp() {
		mn = new MiddleNumber();
		arr = new int[]{ 1, 3, 5, 7, 8, 8 };
		arr1 = new int[]{ 1, 3, 5, 7, 8, 5 };
	}

	@Test
	public void test() throws Exception {
		assertThat(mn.findMiddleNumber(arr), is(3));
	}

	@Test
	public void testException() throws Exception {

		try {
			assertThat(mn.findMiddleNumber(arr), is(3));
		} catch (Exception e) {
			assertThat("Please pass proper array to match the requirement",
					is(e.getMessage()));
		}

	}

}
