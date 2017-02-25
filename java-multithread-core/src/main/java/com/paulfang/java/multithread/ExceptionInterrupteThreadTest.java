package com.paulfang.java.multithread;

/**
 * Example for 1.7.3
 */
public class ExceptionInterrupteThreadTest {

	public static void main(String[] args) {

		
		try {
			Thread counterThread = new Thread(new Counter());
			counterThread.start();
			Thread.sleep(2000);
			counterThread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End !");
	}

}

class Counter extends Thread {

	@Override
	public void run(){
		
		for(int i=0; i < 500000; i++){
			if(this.interrupted()){
				System.out.println("thread is interrupted");
				break;
			}
			System.out.println("counter thread: i = " + i);
		}
		
	}

}