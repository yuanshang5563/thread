package org.ys.thread.lock;

public class DepositThreadLock implements Runnable {
	private AccountLock accountLock;
	private double depositDouble;

	public DepositThreadLock(AccountLock accountLock, double depositDouble) {
		super();
		this.accountLock = accountLock;
		this.depositDouble = depositDouble;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			accountLock.deposit(depositDouble);
		}
	}

}
