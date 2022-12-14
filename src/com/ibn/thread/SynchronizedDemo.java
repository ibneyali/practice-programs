package com.ibn.thread;

class Display {
	public void wish(String name) {
		synchronized (Display.class) {
			for (int i = 0; i < 10; i++) {
				// System.out.print("Good Morning: ");
				try {
					System.out.println("Good Morning: " + name);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// System.out.println(name);
			}
		}
	}
}

class MyThread1 extends Thread {
	Display d;
	String name;

	MyThread1(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		// Display d2 = new Display();
		MyThread1 mt1 = new MyThread1(d, "Hafiz Ji");
		MyThread1 mt2 = new MyThread1(d, "Ibney");
		mt1.start();
		mt2.start();
	}
}