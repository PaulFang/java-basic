package com.paulfang.java.multithread;

/**
 * Example for 1.7.5
 * 
 * stop() 方法已经被废止，如果强制线程停止则可能使一些清理性工作得不到完成，另外就是对锁定的对象进行了解锁，
 * 导致数据得不到同步的处理，出现数据不一致的问题
 */
public class ViolenceStopThreadTest {

	public static void main(String[] args) {
		
		try{
			counterWorker counterThread = new counterWorker();
			counterThread.start();
			Thread.sleep(3000);
			counterThread.stop();
		}catch(InterruptedException e){
			System.out.println("Main Thread catched exception ...");
			e.printStackTrace();
		}
		
	}

}

class counterWorker extends Thread{
	
	@Override
	public void run(){
		
		System.out.println("counterWorker started ...");
		for(int i=0;i<999; i++){
			System.out.println("counterWorker : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
