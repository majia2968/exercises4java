package com.myjava.generics;

public class MySimpleTwoGenerics {

	public static void main(String[] args) {
		SimpleGen<String, Boolean> sg = new SimpleGen<String, Boolean>("Hello", Boolean.FALSE);
		SimpleGen<String, Integer> sample = new SimpleGen<String, Integer>("JAVA2NOVICE", 100);
		sg.printType();
	}

}

/**
 * Simple generics class with two type parameters U, V.
 */
class SimpleGen<U, V> {
	private U uObj;
	private V vObj;
	
	public SimpleGen(U uObj, V vObj) {
		this.uObj = uObj;
		this.vObj = vObj;
	}
	public U getuObj() {
		return uObj;
	}
	public void setuObj(U uObj) {
		this.uObj = uObj;
	}
	public V getvObj() {
		return vObj;
	}
	public void setvObj(V vObj) {
		this.vObj = vObj;
	}
	
	public void printType() {
		System.out.println("U type: " + this.uObj.getClass().getName());
		System.out.println("V type: " + this.vObj.getClass().getName());
	}
}
