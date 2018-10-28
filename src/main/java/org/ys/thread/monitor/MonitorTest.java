package org.ys.thread.monitor;

import java.util.concurrent.TimeUnit;

public class MonitorTest {
	public synchronized void testInstance(){
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("------test instance-------"+System.currentTimeMillis());
	}
	
	public synchronized static void testClass(){
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("------test class-------"+System.currentTimeMillis());
	}
}
