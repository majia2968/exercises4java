package com.myjava.string;

public class MyStringSplit {

	public static void main(String[] args) {
		String str = "This is program splits a string based on space";
		String[] tokens = str.split(" ");
		
		for (String s : tokens) {
			System.out.println(s);
		}
	}

}
