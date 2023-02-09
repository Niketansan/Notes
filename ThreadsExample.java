package com.pratice;

public class ThreadsExample extends Thread {

	public void run() {
		System.out.println("#### Thread class" + Thread.currentThread());
	}

	public static void main(String[] args) {

		ThreadsExample t1 = new ThreadsExample();

		t1.start();
		

	}
}
