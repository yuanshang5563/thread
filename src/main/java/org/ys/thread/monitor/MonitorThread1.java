package org.ys.thread.monitor;

public class MonitorThread1 implements Runnable{

	@Override
	public void run() {
		MonitorTest.testClass();
	}
	
}
