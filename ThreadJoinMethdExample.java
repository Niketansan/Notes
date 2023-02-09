package com.pratice;

public class ThreadJoinMethdExample extends Thread {
	
	/*
	 * 
	 * When the join() method is invoked, the current thread stops its execution 
	 * and the thread goes into the wait state. The current thread remains in the wait 
	 * state until the thread on which the join() method is invoked has achieved its dead state. 
	 * If interruption of the thread occurs, then it throws the InterruptedException.
	 */
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ThreadJoinMethdExample t1 = new ThreadJoinMethdExample();
		ThreadJoinMethdExample t2 = new ThreadJoinMethdExample();
		ThreadJoinMethdExample t3 = new ThreadJoinMethdExample();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
		
		
	}
}
