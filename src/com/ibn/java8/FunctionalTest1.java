package com.ibn.java8;

public class FunctionalTest1 {
	
	public int test(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		FunctionalTest1 ft = new FunctionalTest1();
		System.out.println(ft.test(1, 14));
		
		FunctionalInterfaceTest<Integer, Integer> fit = (a, b) -> {
			if(a==14) {
				System.out.println(a);
				System.out.println(a+b);
			}
			else {
				System.out.println("Wrong values");
			}
			
		};
		
		fit.testMethod(115, 1);
	
	}

}
