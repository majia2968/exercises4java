package com.myjava.string;

import java.sql.Timestamp;

public class MyStringInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "This is a string object";
		String a = new String("this is a string");
		char[] c = {'a', 'b', 'c'};
		String b = new String(c);
		String cc = b + "This is my string";
		final long startTime = System.currentTimeMillis();
		testString();
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime) );
		
		final long startTime1 = System.currentTimeMillis();
		testString1();
		final long endTime1 = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime1 - startTime1) );
		
		final long startTime2 = System.currentTimeMillis();
		testString2();
		final long endTime2 = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime2 - startTime2) );
		
	}
	
	public static void testString() {
		String a = "a";
		for (long i = 0; i < 100000L; i++) {
			a = a.concat("bc");
		}
	}
	
	public static void testString1() {
		StringBuilder sb = new StringBuilder();
		for (long i = 0; i < 100000L; i++) {
			sb.append("bc");
		}
	}
		
		public static void testString2() {
			String a = "a";
			for (long i = 0; i < 100000L; i++) {
				a += "bc";
			}
	}

}
