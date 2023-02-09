package com.pratice;

public class InstanceBlockTest {
	int a ;
	
	InstanceBlockTest(){
		System.out.println("##########################@@@@@@@@@@@@@@@@");
	}
	
	{
		System.out.println("################");
	}
	
	static {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
	}
	
	public static final void test() {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	public void test1(){
		System.out.println("000000000000000");
	}
	
	

	public static void main(String[] args) {
		System.out.println("@@@@@@@@#");
		InstanceBlockTest t = new InstanceBlockTest();
		t.a =1;
		
		test();
		
	}
}
