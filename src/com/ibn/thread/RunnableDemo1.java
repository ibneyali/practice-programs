package com.ibn.thread;

//class MyRunnable implements Runnable {
//
//	@Override
//	public void run() {
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("Child thread : " + i);
//			Thread.yield();
//		}
//
//	}
//
//}
//
//public class RunnableDemo1 {
//
//	public static void main(String[] args) {
//		MyRunnable mr = new MyRunnable();
//		Thread th = new Thread(mr);
//		th.start();
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("Main thread : " + i);
//
//		}
//
//	}
//
//}


public class RunnableDemo1 {

	public static void main(String[] args) {
		
		Runnable runnable = () ->{
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child thread : " + i);
			}
		};
		
		Thread th = new Thread(runnable);
		th.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main thread : " + i);

		}

	}

}
