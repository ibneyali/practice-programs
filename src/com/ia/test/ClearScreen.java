package com.ia.test;

public class ClearScreen {

	public static void main(String[] args) {
		System.out.println("k");
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
