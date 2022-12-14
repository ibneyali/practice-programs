package com.ibn.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FindAllNames {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
//		Consumer<Integer> method = (n) -> { System.out.println(n); };
//	    al.forEach( method );
//	    System.out.println();
		al.forEach(System.out::println);
	}

}
