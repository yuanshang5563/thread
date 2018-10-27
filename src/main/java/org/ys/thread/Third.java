package org.ys.thread;

import java.util.concurrent.Callable;

public class Third implements Callable<Integer> {

	private int i;
	@Override
	public Integer call() throws Exception {
		for (; i < 100; i++) {
			System.out.println("---------- " + Thread.currentThread().getName() + " " + i);
		}		
		return i;
	}

}
