package org.ys.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThirdThread{
	
	public static void main(String[] args) {
		Third third = new Third();
		FutureTask<Integer> task = new FutureTask<Integer>(third);
		for (int j = 0; j < 100; j++) {
			System.out.println(Thread.currentThread().getName() + " " + j);
			if(j == 20){
				new Thread(task).start();
			}
		}
		try {
			System.out.println("子线程返回值：" + task.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
