package org.ys.thread.syn;

public class DrawThread implements Runnable {
	private Account account;
	private double drawDouble;

	public DrawThread(Account account, double drawDouble) {
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
