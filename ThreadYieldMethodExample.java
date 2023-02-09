package com.pratice;

public class ThreadYieldMethodExample extends Thread {
	/*
	 * 
	 * The yield() method of thread class causes the currently executing thread
	 * object to temporarily pause and allow other threads to execute.proity
	 */

	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}

	public static void main(String[] args) {
		ThreadYieldMethodExample t1 = new ThreadYieldMethodExample();
		ThreadYieldMethodExample t2 = new ThreadYieldMethodExample();
		
		// this will call run() method

		t1.setName("sairam");
		t1.start();
		t1.setPriority(1);
		t1.yield();

		t2.setName("Nikhil");
		t2.start();
		t2.setPriority(9);


	}
}
