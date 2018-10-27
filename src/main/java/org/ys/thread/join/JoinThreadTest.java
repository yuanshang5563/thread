package org.ys.thread.join;

import java.util.concurrent.FutureTask;

public class JoinThreadTest {

	public static void main(String[] args) {
		JoinThread join = new JoinThread();
		FutureTask<String> task = new FutureTask<String>(join);
		JoinThread join1 = new JoinThread();
		FutureTask<String> task1 = new FutureTask<String>(join1);
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 90){
				try {
					Thread thread = new Thread(task);
					thread.start();
					thread.join();
					Thread thread1 = new Thread(task1);
					thread1.start();
					thread1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
