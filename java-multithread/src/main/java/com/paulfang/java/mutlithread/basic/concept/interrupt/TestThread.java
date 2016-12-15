package com.paulfang.java.mutlithread.basic.concept.interrupt;

public class TestThread extends Thread {

	@Override
	public void run() {

		// takes about 4 - 5 seconds
		long start = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("Takes time : " + (System.currentTimeMillis() - start) + " ms");

	}

}
