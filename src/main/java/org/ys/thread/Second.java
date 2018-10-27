package org.ys.thread;

public class Second implements Runnable {

	private int i = 0;
	
	@Override
	public void run() {
		for (; i < 100; i++) {
			System.out.println("---------- " + Thread.currentThread().getName() + " " + i);
		}
	}
}
