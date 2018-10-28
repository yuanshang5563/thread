package org.ys.thread.monitor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MonitorPool {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		MonitorTest monitortest = new MonitorTest();
		executorService.submit(new MonitorThread1());
		executorService.submit(new MonitorThread1());
		executorService.submit(new MonitorThread2(monitortest));
		executorService.submit(new MonitorThread2(monitortest));
		executorService.shutdown();
	}
	
}
