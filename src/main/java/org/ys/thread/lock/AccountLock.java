package org.ys.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AccountLock {
	private double balance;
	private boolean flag = false;
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public AccountLock(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void draw(double drawDouble){
		lock.lock();
		try {
			if(flag){
				if(balance >= drawDouble){
					//Thread.sleep(1000);
					balance -= drawDouble;
					System.out.println(Thread.currentThread().getName() + " 取钱成功，取出金额："+drawDouble+"，余额："+balance);
				}else{
					System.out.println(Thread.currentThread().getName() + " 取钱失败，余额不足！");
				}
				flag = false;
				condition.signalAll();
			}else {
				condition.await();
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void deposit(double depositDouble){
		lock.lock();
		try {
			if(!flag){
				balance += depositDouble;
				System.out.println(Thread.currentThread().getName() + " 存钱成功，存入金额："+depositDouble+"余额："+balance);
				flag = true;
				condition.signalAll();
			}else{
				condition.await();
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
