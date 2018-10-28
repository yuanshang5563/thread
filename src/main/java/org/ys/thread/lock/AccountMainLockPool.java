package org.ys.thread.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.ys.thread.syn.DepositThread;
import org.ys.thread.syn.DrawThread;

public class AccountMainLockPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		AccountLock account = new AccountLock(0);
		DrawThreadLock drawThreadLock = new DrawThreadLock(account,1000.0);
		DepositThreadLock depositThreadLock = new DepositThreadLock(account, 1000.0);
		executorService.submit(drawThreadLock);
		executorService.submit(depositThreadLock);
		executorService.shutdown();
	}
}
