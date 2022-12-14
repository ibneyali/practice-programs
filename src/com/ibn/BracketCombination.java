package com.ibn;

public class BracketCombination {

	public static int BracketCombinations(int num) {
		
		int fu = num * 2;
		int fl = 1;
		for (int i = (num*2) - 1; i > num + 1; i--) {
			fu = (fu) * (i);
		}

		for (int i = 1; i <= num; i++) {
			fl = fl * i;
		}

		num = fu / fl;

		return num;
		
	}

	public static void main(String[] args) {
		System.out.println(BracketCombinations(4));
	}
}
