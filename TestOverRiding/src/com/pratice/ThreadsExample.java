package com.pratice;

public class ThreadsExample extends Thread {

	public void run() {
		System.out.println(ThreadsExample.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		ThreadsExample t1 = new ThreadsExample();
		t1.setName("Sairam");
		//t1.setPriority(10);
		t1.start();

		ThreadsExample t2 = new ThreadsExample();
		t2.setName("Nikhil");

		t2.start();
	}
}
