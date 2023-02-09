package com.pratice;

public class ThreadSleepMethodExample extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			// the thread will sleep for the 500 milli seconds
			try {
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ThreadSleepMethodExample t1 = new ThreadSleepMethodExample();
		ThreadSleepMethodExample t2 = new ThreadSleepMethodExample();

		t1.start();
		t1.setDaemon(true);
		t2.start();
	}
}
