package com.paulfang.java.mutlithread.basic.concept.interrupt;

/**
 * <p>This program demonstrate the interrupte method of Thread 
 * can not interrupte a running thread.
 */
public class InterruptTest {

	public static void main(String[] args) {

		try {
			Thread t = new TestThread();
			t.start();
			Thread.sleep(1000);// or t.sleep(1000);
			t.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
