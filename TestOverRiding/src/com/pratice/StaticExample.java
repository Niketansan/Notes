package com.pratice;

public class StaticExample {
	
	/*
	 * 
	 *  STATIC VARIABLE
	 */
	
	static String name = "SAIRAM";
	
	/*
	 * 
	 * STATIC CLASS
	 */

	static class Test1 {

		static String test = "test1";
	}

	/*
	 * 
	 * STATIC METHOD
	 */
	public static void test() {
		System.out.println(Test1.test);
		System.out.println("Test");
	}

	/*
	 * 
	 *  STATIC BLOCK
	 */
	static {
		System.out.println("ertet");
	}

	public static void main(String[] args) {
		/*
		 * 
		 *   STATIC CALLING -- CLASSNAME.METHODNAME OR CLASSNAME.VARIABLENAME
		 */
		
		StaticExample.test();
		System.out.println(StaticExample.name);
	}
}
