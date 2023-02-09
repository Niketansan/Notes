package com.pratice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Users implements Runnable {
	private String taskName;

	public Users(String str) {

		taskName = str;
	}

	public void run() {
		// bussiness logic of adharcard
		try {
			for (int j = 0; j <= 5; j++) {
				if (j == 0) {
					Date dt = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

					System.out.println("Initialization time for the task name: " + taskName + " = " + sdf.format(dt));

				} else {
					Date dt = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

					System.out.println("Time of execution for the task name: " + taskName + " = " + sdf.format(dt));

				}

				Thread.sleep(1000);
			}

			System.out.println(taskName + " is complete.");
		}

		catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

public class ThreadPoolExample {
	public static void main(String[] args) {
		Runnable rb1 = new Users("Users 1");
		Runnable rb2 = new Users("Users 2");
		Runnable rb3 = new Users("Users 3");
		Runnable rb4 = new Users("Users 4");
		Runnable rb5 = new Users("Users 5");

		// creating a thread pool with MAX_TH number of
		// threads size the pool size is fixed
		ExecutorService pl = Executors.newFixedThreadPool(3);

		// passes the Task objects to the pool to execute (Step 3)
		pl.execute(rb1);
		pl.execute(rb2);
		pl.execute(rb3);
		pl.execute(rb4);
		pl.execute(rb5);

		// pool is shutdown
		pl.shutdown();
	}

}
