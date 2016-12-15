package com.paulfang.java.mutlithread.classic;

public class Test {

	public static void main(String[] args) {

		EventConstainer container = new EventConstainer();
		new Thread(new Producer(container)).start();
		new Thread(new Consumer(container)).start();

	}

}
