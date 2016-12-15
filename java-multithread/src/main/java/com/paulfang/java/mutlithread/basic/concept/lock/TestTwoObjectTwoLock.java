package com.paulfang.java.mutlithread.basic.concept.lock;

public class TestTwoObjectTwoLock {
	
	public static void main(String[] args){
		
		HasSelfPrivateNum numRefA = new HasSelfPrivateNum();
		HasSelfPrivateNum numRefB = new HasSelfPrivateNum();
		
		Thread threadA = new ThreadA(numRefA);
		Thread threadB = new ThreadB(numRefB);
		
		threadA.start();
		threadB.start();
	}

}
