package com.myjava.string;

public class MyStringBytes {
	
    public static void main(String a[]){
        
        String str = "core java api";
        byte[] b = str.getBytes();
        System.out.println("String length: "+str.length());
        System.out.println("Byte array length: "+b.length);
    }

}
