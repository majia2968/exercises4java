package com.myjava.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStringMaches {

	/**
	 * matches method returns whether the whole string maches the regex, not just any substring.
	 * If you want to see if the matches an input text, use a Pattern, a Matcher, or find method.
	 */
	public static void main(String[] args) {
		
        String[] str = {"www.java2novice.com", "http://java2novice.com"};
        for(int i=0;i < str.length;i++){
            if (str[i].matches("^www(.+)")){
                System.out.println(str[i]+" Starts with 'www'");
            } 
            else {
                System.out.println(str[i]+" is not starts with 'www'");
            }
        }
        
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher("abcd");
        if (m.find()) {
        	System.out.println("Match");
        }
        else {
        	System.out.println("Not Match");
        }
	}
}
