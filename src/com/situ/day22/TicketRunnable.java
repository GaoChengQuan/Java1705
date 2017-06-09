package com.situ.day22;

public class TicketRunnable implements Runnable{
	private int ticketCount = 100;
	
	public void run() {
		while (ticketCount > 0) {
			sellTicket();
		}
	}

	private synchronized void sellTicket() {
		if (ticketCount > 0) {
			System.out.println(Thread.currentThread().getName() + "卖出了第"
					+ ticketCount + "张票");
			ticketCount--;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/*public void run() {
		while (ticketCount > 0) {
			synchronized (this) {
				if (ticketCount > 0) {
					System.out.println(Thread.currentThread().getName() + "卖出了第"
							+ ticketCount + "张票");
					ticketCount--;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}*/
}
