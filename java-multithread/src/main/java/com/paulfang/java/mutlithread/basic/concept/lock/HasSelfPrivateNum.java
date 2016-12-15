package com.paulfang.java.mutlithread.basic.concept.lock;

public class HasSelfPrivateNum {
	private int num = 0;
	synchronized public void addI(String username){
		if("a".equals(username)){
			num = 100;
			System.out.println("a set num to 100 !");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			num = 200;
			System.out.println("b set num to 200 !");
		}
		System.out.println("username = " + username + ", num = " + num);
	}

}
