package com.myjava.string;

public class MyArrayCopy {
	
    public static void main(String a[]){
        char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};

        String str = new String(ch);
        
        String chStr = String.copyValueOf(ch);
        
        System.out.println(str.equals(chStr));
 
    }
}
