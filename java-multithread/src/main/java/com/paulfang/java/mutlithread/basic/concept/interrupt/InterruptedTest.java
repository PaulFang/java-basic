package com.paulfang.java.mutlithread.basic.concept.interrupt;
/**
 * Notice the API documentation of the method interrupted of Thread.
 * "Tests whether the current thread has been interrupted. "
 * For this demonstrate program, the current thread is main thread.
 */
public class InterruptedTest {

	public static void main(String[] args) {
		
		try {
			Thread t = new TestThread();
			t.start();
			Thread.sleep(1000);
			t.interrupt(); // NOTICE HERE!
			//Thread.currentThread().interrupt();
			System.out.println("A-1. thread stopped ? " + t.interrupted());
			System.out.println("A-2. thread stopped ? " + t.interrupted());
			
			// do nothing but wait the first thread of TestThread finish
			for(int i=0; i< 500100; i++);
			System.out.println("-------------------------------------------");
			
			// DO NOT try to call t.start(); here. it will throw java.lang.IllegalThreadStateException
			// As the start method of thread cannot support call again when started. 
			
			System.out.println("t = " + t);
			t = new TestThread();
			
			Thread.sleep(1000);
			Thread.currentThread().interrupt(); // NOTICE HERE!
			//Thread.currentThread().interrupt();
			System.out.println("B-1. thread stopped ? " + Thread.interrupted());
			System.out.println("B-2. thread stopped ? " + Thread.interrupted());
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end of main !");
		
		
	}

}
