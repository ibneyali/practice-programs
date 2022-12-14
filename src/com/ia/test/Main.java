package com.ia.test;

public class Main {

	private int variableA = showOutput();
	private static int variableB = 15;
	public static void main(String[] args) {
		System.out.println(new Main().variableA);
	}
	private int showOutput() {
		return variableB;
	}
}
