package com.paulfang.java.mutlithread.classic;

import java.util.Date;

public class EventConstainer {
	
	private String productName;
	private Status status = Status.EMPTY;
	
	public EventConstainer(){
		this.productName = "name_" + new Date().getTime();
		this.status = Status.FULL;
		System.out.println("    produced product : " + productName);
	}
	
	enum Status {
		EMPTY,FULL;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
