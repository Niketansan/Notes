package com.pratice;

public class ThreadExample2 implements Runnable {

	@Override
	public void run() {
	
		for(int i =0;i<10;i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		ThreadExample2 exp = new ThreadExample2();
		Thread t = new Thread(exp);
		t.setName("Sairam");
		t.setPriority(Thread.MAX_PRIORITY); // 1 to 10

		t.start();

	}

}
