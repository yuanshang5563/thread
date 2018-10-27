package org.ys.thread.lock;

public class AccountMainLock {
	public static void main(String[] args) {
		AccountLock account = new AccountLock(0);
		DrawThreadLock drawThreadLock = new DrawThreadLock(account,1000.0);
		DepositThreadLock depositThreadLock = new DepositThreadLock(account, 1000.0);
		new Thread(drawThreadLock).start();
		new Thread(depositThreadLock).start();
	}
}
