package org.ys.thread.syn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountMainPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Account account = new Account(0);
		DrawThread drawThread = new DrawThread(account,100);
		DepositThread depositThread = new DepositThread(account,100);
		executorService.submit(depositThread);
		executorService.submit(drawThread);
		executorService.shutdown();
	}
}
