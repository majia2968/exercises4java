package com.myjava.string;

public class MyStringHtmlTagRemover {

	public static void main(String[] args) {
		String text = "<B>I don't want this to be bold <\\B>";
		System.out.println(text.replaceAll("<.*?\\>", ""));
	}

}
