package com.paulfang.java.mutlithread.classic;

import java.util.Date;

import com.paulfang.java.mutlithread.classic.EventConstainer.Status;

public class Producer implements Runnable {

	private EventConstainer container;

	public Producer(EventConstainer container) {
		this.container = container;
	}

	@Override
	public void run() {
		synchronized (container) {
			while(true){
				if (Status.EMPTY == container.getStatus()) {
					produce();
					container.notify();
				} else {
					try {
						container.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private void produce() {
		container.setProductName("name_" + new Date().getTime());
		container.setStatus(Status.FULL);
		System.out.println("Producer produced product : " +  container.getProductName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
