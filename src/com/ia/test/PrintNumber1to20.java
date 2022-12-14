package com.ia.test;

public class PrintNumber1to20 {
	
	public static void main(String[] args) throws InterruptedException {

		try {
			while (true) {
				for (int i = 1; i <= 50; i++) {
					System.out.println("  "+i);
					Thread.sleep(3000);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
