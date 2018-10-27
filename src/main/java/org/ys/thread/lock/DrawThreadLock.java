package org.ys.thread.lock;

public class DrawThreadLock implements Runnable {
	private AccountLock account;
	private double drawDouble;

	public DrawThreadLock(AccountLock account, double drawDouble) {
		super();
		this.account = account;
		this.drawDouble = drawDouble;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.draw(drawDouble);
		}
	}

}
