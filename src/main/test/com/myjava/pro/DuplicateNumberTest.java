package com.myjava.pro;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class DuplicateNumberTest {

	@Test
	public void test() {
		DuplicateNumber dn = new DuplicateNumber();
		int[] arr = {1,2,3,4,5,4,7,8,8,9};
		dn.findDuplicateNumber(arr);
		System.out.println(dn.toString());
		Set<Integer> expected = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,7,8,9));
		Set<Integer> expected1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,4,5,7,8,9));

		assertThat(dn.tmpSet, is(expected));
		assertThat(dn.tmpSet, is(expected1));


	}

}
