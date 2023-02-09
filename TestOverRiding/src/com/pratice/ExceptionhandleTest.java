package com.pratice;

public class ExceptionhandleTest {
	public static void main(String[] args) {
		try {
			//add();
			ageLimitCheck(17);
		}

		catch (Exception e) {
			e.printStackTrace();

		}

		System.out.println("21231321");

	}

	public static void add() throws Exception {
		try {
			int a = 10;
			int c = a / 0;

		}catch(ArithmeticException e) {
			
			throw new ArithmeticException(" Unable to divide by zero");
			
		}catch (Exception e) {

			throw new Exception(" Unable to divide by zero");
		}

	}

	public static String ageLimitCheck(int age) throws AgeLimitExcpetion {

		if (age > 18) {

		} else {
			throw new AgeLimitExcpetion("Age is less than 18");
		}

		return "Success ";
	}
}
