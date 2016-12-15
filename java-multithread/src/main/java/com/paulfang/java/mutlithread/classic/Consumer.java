package com.paulfang.java.mutlithread.classic;

import com.paulfang.java.mutlithread.classic.EventConstainer.Status;

public class Consumer implements Runnable {

	private EventConstainer container;

	public Consumer(EventConstainer container) {
		this.container = container;
	}

	@Override
	public void run() {
		synchronized (container) {
			while(true){
				if (Status.FULL == container.getStatus()) {
					consume();
					container.notify(); // wake up the thread which wait the container lock 
				} else {
					try {
						container.wait(); // release the container lock < occur run out of the synchronized code>
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private void consume() {
		System.out.println("Consumer consumed product : " +  container.getProductName() + "\n");
		container.setProductName("UNKNOWN");
		container.setStatus(Status.EMPTY);
	}

}
