package com.test.ex;

public class CountBean {
	private int cntNumber;
	
	//기본생성자
	public CountBean() {
		System.out.println("CountBead 생성!!!");
	}
	
	public void setCount(int n) {
		cntNumber += n;
	}
	
	public int getCount() {
		return cntNumber;
	}
	
	
	
	
}
