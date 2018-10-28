package org.ys.thread.monitor;

public class MonitorThread2 implements Runnable{

	private MonitorTest monitorTest;
	
	public MonitorThread2(MonitorTest monitorTest) {
		super();
		this.monitorTest = monitorTest;
	}

	@Override
	public void run() {
		monitorTest.testInstance();
	}
	
}
