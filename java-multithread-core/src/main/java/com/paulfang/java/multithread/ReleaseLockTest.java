package com.paulfang.java.multithread;

/**
 * Example for 1.7.7
 * 强制 stop 造成数据不一致
 */
public class ReleaseLockTest {

	public static void main(String[] args) {
		
		
		try {
			SynchronizedItem item = new SynchronizedItem();
			Thread thread = new MyThread(item);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println("item.name : " + item.getName() + ", item.password : " + item.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

class MyThread extends Thread{
	
	private SynchronizedItem obj;
	
	public MyThread(SynchronizedItem obj){
		this.obj = obj;
	}
	
	@Override
	public void run(){
		obj.printString("NewUserName","NewPassword");
	}
	
}

class SynchronizedItem{
	
	private String name = "UserName";
	private String password = "password";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	synchronized public void printString(String name, String password){
		
		try{
			this.name = name;
			Thread.sleep(1000000);
			this.password = password;
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		
	}
	
	
}