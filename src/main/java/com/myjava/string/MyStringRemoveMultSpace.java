package com.myjava.string;

/**
 * String literal "\\" represents the string consisting of a single backslash. 
 *
 */
public class MyStringRemoveMultSpace {

	public static void main(String[] args) {
		System.out.println("  This is   my   time to shine  ".replaceAll("\\s+", " ").trim());
	}

}
