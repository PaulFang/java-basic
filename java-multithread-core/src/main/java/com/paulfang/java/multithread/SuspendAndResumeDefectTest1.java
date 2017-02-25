package com.paulfang.java.multithread;

/**
 * Example for 1.8.2
 * 
 *  在使用 suspend ,resume 方法时，若使用不当，极易造成该公共的同步对象的独占，
 *  使得其他线程无法访问公共同步对象
 */
public class SuspendAndResumeDefectTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		final SynchronizedObject obj = new SynchronizedObject();
		
		Thread thread = new Thread(){
			
			@Override
			public void run(){
				obj.printString();
			}
		};
		
		thread.setName("a");
		thread.start();
		Thread.sleep(1000);
		Thread thread2 = new Thread(){
			
			@Override
			public void run(){
				System.out.println("xxx");
				obj.printString();
			}
		};
		thread2.start();
		
	}

}

class SynchronizedObject{
	
	synchronized public void printString(){
		System.out.println("begin");
		
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("a 线程永远 suspend 了");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
		
	}
	
}
