package com.paulfang.java.multithread;

/**
 * synchronized 锁重入 
 * 当一个线程的奥一个对象锁后，再次请求此对象锁时是可以再次得到改对象的锁的
 * 当存在父子类继承关系时，子类是完全可以通过可重入锁调用父类的同步方法的
 *
 */
public class SynchronizedReentrantLocakInheritanceTest {

	public static void main(String[] args) {
		
		TestThread t = new TestThread();
		t.start();
	}

}

class TestThread extends Thread{
	
	@Override
	public void run(){
		//Sub sub = new Sub();
	}
	
}
