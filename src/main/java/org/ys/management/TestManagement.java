package org.ys.management;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class TestManagement {
	public static void main(String[] args) {
		MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
		MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();
		System.out.println("堆内存："+memoryUsage.getUsed()+"，初始大小："+memoryUsage.getInit()+"，已用大小："+memoryUsage.getUsed());
	}
}
