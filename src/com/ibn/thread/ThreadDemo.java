package com.ibn.thread;

class MyThread extends Thread {

	public void run() {
		Thread.currentThread().setName("run");
		for (int i = 1; i <= 100; i++) {
			System.out.println("Child Thread : " + Thread.currentThread().getName());
		}
	}

}

/**
 * @author Ibney.Ali
 *
 */

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		t.setPriority(Thread.MIN_PRIORITY);
		for (int i = 1; i <= 100; i++) {
			
			System.out.println("Main Thread : " + Thread.currentThread().getName());
		}
	}

}
