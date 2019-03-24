package com.thread;

public class Mythread extends Thread{
	 private int count =0 ;
	private Bool boo;
	public int getCount() {
		return count;	
	}
	public void setCount(int count) {
		this.count= count;
	}
	
	Mythread(Bool b){
		this.boo= b;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i= 0;i<100000;i++) {
			count++;
			
		}
	/*	while(boo.getFlag()) {	
			synchronized(this) {
				
			}
		}*/
	}

}
