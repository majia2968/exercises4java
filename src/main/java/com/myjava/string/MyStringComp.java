package com.myjava.string;

public class MyStringComp {

	
    public static void main(String a[]){
        
        String c = "We are comparing the content with a StringBuffer content";
        StringBuffer sb =
            new StringBuffer("We are comparing the content with a StringBuffer content");
        /**
         * We can use contentEquals() method to compare content with a StringBuffer.
         * It returns boolean value.
         * String.equals only compare String objects
         * String.contentEquals doesn't call toString method, it compares with char[] array.
         */
        if(c.contentEquals(sb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
        StringBuffer asb =
            new StringBuffer("You cannot compare the content with a String content");
        if(c.contentEquals(asb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
        
        String str = "abc";
        StringBuilder sb1 = new StringBuilder("abc");
        System.out.println("different data type: " + str.equals(sb1));
    }

}
