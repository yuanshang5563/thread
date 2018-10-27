package org.ys.thread.syn;

public class Account {
	private double balance;
	private boolean flag = false;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public synchronized void draw(double drawDouble){
		try {
			if(flag){
				if(balance >= drawDouble){
					//Thread.sleep(1000);
					balance -= drawDouble;
					System.out.println(Thread.currentThread().getName() + " 取钱成功，取出金额："+drawDouble+"余额："+balance);
				}else{
					System.out.println(Thread.currentThread().getName() + " 取钱失败，余额不足！");
				}
				flag = false;
				notifyAll();
			}else{
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void deposit(double depositDouble){
		try {
			if(!flag){
				balance += depositDouble;
				System.out.println(Thread.currentThread().getName() + " 存钱成功，存入金额："+depositDouble+"余额："+balance);
				flag = true;
				notifyAll();
			}else{
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
