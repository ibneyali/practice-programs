package com.ibn.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateAndFunction {
	
	public static void main(String[] args) {
		
		String b = "Ibney";
		System.out.println(b.length());
		Function<String, Integer> lenght = a-> a.length();
		System.out.println(lenght.apply(b).intValue());
		
		Predicate<Integer> pr = i->i>5;
		System.out.println(pr.test(10));
		
		List<Integer> numList = new ArrayList<>();
	      numList.add(5);
	      numList.add(10);
	      Predicate<Integer> pred = i -> i > 5;
	      numList.stream().filter(pred).forEach(i -> System.out.println(i));
	      
	      Function<Integer, Integer> func = i->i+i;
	      numList.stream().map(func).forEach(r->{
	    	  System.out.println(r);
	      });
	}

}
