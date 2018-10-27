package org.ys.thread.syn;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account(0);
		DrawThread drawThread = new DrawThread(account,100);
		DepositThread depositThread = new DepositThread(account,100);
		new Thread(depositThread).start();
		new Thread(drawThread).start();
	}
}
