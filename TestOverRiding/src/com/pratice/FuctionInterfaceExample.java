package com.pratice;

@FunctionalInterface
interface Example {

	void test(int a); // allowed only abstract method for functional interfaces

	default void test1() { //backward comptabilty feature
		System.out.println("default method");
	}

	public static void test2() {
		System.out.println("static method");
	}
}

public class FuctionInterfaceExample {


	public static void main(String[] args) {

		System.out.println("Lamba  express only use when you have functional interfaces ");
		Example exp =(int a)->{
			System.out.println("override logic"+a);
		};
		exp.test(1);
		exp.test1();// default method calling 

		Example.test2();
		
	}

}
