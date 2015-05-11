package com.myjava.string;

public class MyStringStartWith {

	public static void main(String[] args) {
		String str = "This is the whole true, take it or leave it!";
		System.out.println(str.startsWith("This"));
		System.out.println(str.startsWith("this"));
		System.out.println(str.startsWith("is", 2));

	}

}
