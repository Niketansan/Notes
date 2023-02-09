package com.pratice;

class EvenNumber {
	static synchronized void printEven(int n) {// synchronized method
	
			for (int i = 1; i <= n; i = i + 2) {
				System.out.println(i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		
	}
}

class MyThread1 extends Thread {
	EvenNumber t;

	MyThread1(EvenNumber t) {
		this.t = t;
	}

	public void run() {
		t.printEven(5);
	}

}

class MyThread2 extends Thread {
	EvenNumber t;

	MyThread2(EvenNumber t) {
		this.t = t;
	}

	public void run() {
		t.printEven(10);
	}
}

public class ThreadSyncExample {
	public static void main(String[] args) {
		EvenNumber obj = new EvenNumber();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}

}
