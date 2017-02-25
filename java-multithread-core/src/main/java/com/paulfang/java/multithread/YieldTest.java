package com.paulfang.java.multithread;

/**
 * 该方法与sleep()类似，只是不能由用户指定暂停多长时间，并且yield（）方法只能让同优先级的线程有执行的机会。
 * 理论上，yield意味着放手，放弃，投降。一个调用yield()方法的线程告诉虚拟机它乐意让其他线程占用自己的位置。
 * 这表明该线程没有在做一些紧急的事情。注意，这仅是一个暗示，并不能保证不会产生任何影响。
 * 
 * Yield是一个静态的原生(native)方法
 * Yield告诉当前正在执行的线程把运行机会交给线程池中拥有相同优先级的线程。
 * Yield不能保证使得当前正在运行的线程迅速转换到可运行的状态
 * 它仅能使一个线程从运行状态转到可运行状态，而不是等待或阻塞状态
 */

public class YieldTest {

	public static void main(String[] args) {

		Thread thread = new TestThread1();
		thread.start();
		System.out.println("--------");
		
	}

}

class TestThread1 extends Thread {
	
	@Override
	public void run(){
		long start = System.currentTimeMillis();
		for(int i=0; i<999999999; i++){
			for(int j=0; j<99999999; j++){
//				for(int k=0; k< 500; k++){
//				}
			}
			Thread.yield();
		}
		System.out.println("TestThread takes " + (System.currentTimeMillis() - start));
	}
	

}
