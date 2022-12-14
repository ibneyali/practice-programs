package com.ibn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated {

	public static void main(String[] args) {

		String[] str = { "1, 3, 4, 7, 13", "1, 2, 4, 13, 15" };

		String str1 = str[0];		
		System.out.println(str1);
		
		List<String> s1 = Arrays.asList(str1);
		System.out.println(s1);
		
		List<String> s = Arrays.stream(str1.split(",")).map(String::trim).collect(Collectors.toList());
		
		String st1 = "Ibney Ali";
		List<String> st2 = Arrays.asList(st1);
			
		System.out.println(st2.get(0));
	}

}
