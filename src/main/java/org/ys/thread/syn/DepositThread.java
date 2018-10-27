package org.ys.thread.syn;

public class DepositThread implements Runnable {
	private Account account;
	private double depositDouble;

	public DepositThread(Account account, double depositDouble) {
		super();
		this.account = account;
		this.depositDouble = depositDouble;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.deposit(depositDouble);
		}
	}

}
