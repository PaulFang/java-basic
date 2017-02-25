package com.paulfang.java.multithread;

public class StopThreadByInterrupteAndReturnTest {

	public static void main(String[] args) throws InterruptedException {

		Worker worker = new Worker();
		worker.start();
		Thread.sleep(3000);
		worker.interrupt();

	}

}

class Worker extends Thread {

	public void run() {
		while (true) {

			if (this.isInterrupted()) {
				System.out.println("Worker thread stopped");
				return;
			}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println("Worker ： " + System.currentTimeMillis());
		}
	}

}