package org.ys.thread;

public class FirstThread extends Thread{

	private int i = 0;
	
	@Override
	public void run() {
		for (; i < 100; i++) {
			System.out.println("---------- " + this.getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		for (int j = 0; j < 100; j++) {
			System.out.println(Thread.currentThread().getName() + " " + j);
			if(j == 20){
				new FirstThread().start();
				new FirstThread().start();
			}
		}
	}
}
