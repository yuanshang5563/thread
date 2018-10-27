package org.ys.thread.join;

import java.util.concurrent.Callable;

public class JoinThread implements Callable<String> {

	@Override
	public String call() throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return "线程结束";
	}

}
