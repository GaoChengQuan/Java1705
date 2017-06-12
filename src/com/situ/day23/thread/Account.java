package com.situ.day23.thread;

public class Account {
	private String name;
	//余额
	private double balance;
	//是不是已经存钱
	private boolean isDeposit = false;

	public Account() {
		super();
	}

	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public synchronized void draw(double drawAmount) {
		//if (!isDeposit) {
		if (isDeposit == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("线程：" + Thread.currentThread().getName() + "取款"
					+ drawAmount);
			balance -= drawAmount;
			System.out.println("账户余额：" + balance);
			isDeposit = false;
			notifyAll(); // 唤醒等待此同步锁的所有线程
		}
	}

	public synchronized void deposit(double depositAmount) {
		if (isDeposit == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("线程：" + Thread.currentThread().getName() + "存款"
					+ depositAmount);
			balance += depositAmount;
			System.out.println("账户余额：" + balance);
			isDeposit = true;
			notifyAll();
		}
	}
}
