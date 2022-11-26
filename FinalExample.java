/**
 * 
 */
package com.pratice;

/**
 * @author gsair
 *
 */

final class Test {

	private final int id;

	Test(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + "]";
	}
	
	

}

public class FinalExample extends InstanceBlockTest {

	/**
	 * @param args
	 */

	public static final String username = "sairam356";
	
	
	@Override
	public void test1() {
         System.out.println("Tes111111111111111");
	}

	public static void main(String[] args) {

		/*
		 * 
		 * The final local variable a cannot be assigned.
		 * 
		 * Cannot override the final method from InstanceBlockTest
		 */
		FinalExample finalExample = new FinalExample();
		
		finalExample.test1();
		/*
		 * immutiable class
		 */
		String s = "sairam";
		String concat = s.concat("123");

		System.out.println(concat);

		Test t = new Test(1);
		
		System.out.println(t);
		System.out.println(t.getId());

		int arr[] = { 100, 323, 423 };

	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
