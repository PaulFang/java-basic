package com.paulfang.java.multithread;

/**
 * Example for 1.7.4
 */
public class InterrupteThreadInSleepTest {

	public static void main(String[] args) {
		
		try{
			CounterThread counterThread = new CounterThread();
			counterThread.start();
			Thread.sleep(2000);
			counterThread.interrupt();
			
		}catch(InterruptedException e){
			System.out.println("catched exception");
			e.printStackTrace();
		}
		
	}

}

class CounterThread extends Thread{
	
	@Override
	public void run(){
		try{
			System.out.println("CounterThread started");
			Thread.sleep(20000);
			System.out.println("CounterThread ended");
		}catch(InterruptedException e){
			System.out.println("interrupted in asleep. this.isInterrupted() = " + this.isInterrupted() );
		}
	}
}
