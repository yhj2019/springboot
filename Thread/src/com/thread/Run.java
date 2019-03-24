package com.thread;

public class Run {

	public static void main(String[] args) {
		Bool boo = new Bool();
		Mythread thread = new Mythread(boo);
		Thread thread1 = new Thread(thread);
		Thread thread2 = new Thread(thread);
		thread1.start();
		thread2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boo.setFlag(false);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(thread.getCount());
		System.out.println("haha");
	}

}

class Bool {
	private Boolean flag = true;

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean b) {
		this.flag = b;
	}
}
