package com.ibn.java8;

import java.util.ArrayList;
import java.util.List;

public class FunctionalTest2 {
	
	public static void main(String[] args) {
		
		FuncInterface fit = (s1, s2) -> {
				if(s1=="Ibney1") {
					return "Ibney";
				}
				return "Ali";
		};
		
		System.out.println(fit.getName("Ibney", "Ali"));
		
		List<String> s = new ArrayList<String>();
		s.add("Mohd Ali");
		s.add("Ibney Ali");
		s.add("Mohd Hashim");
		s.add("Mohd Arslan");
		s.add("Mohd Arhan");
		
		for(String s1 : s) {
			System.out.println(s1);
		}
		
		s.forEach(s1 -> {
			System.out.println();
		});
		
	}

}
