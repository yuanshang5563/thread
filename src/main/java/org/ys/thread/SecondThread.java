package org.ys.thread;

public class SecondThread{
	
	public static void main(String[] args) {
		Second second = new Second();
		for (int j = 0; j < 100; j++) {
			System.out.println(Thread.currentThread().getName() + " " + j);
			if(j == 20){
				new Thread(second).start();
				new Thread(second).start();
			}
		}
	}
}
