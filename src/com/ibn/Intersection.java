package com.ibn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intersection {

	public static String FindIntersection(String[] strArr) {
		
		// code goes here
		// input {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}

		String str1 = strArr[0];
		String str2 = strArr[1];

		List<String> num1 = Arrays.stream(str1.split(",")).map(String::trim).collect(Collectors.toList());

		List<String> num2 = Arrays.stream(str2.split(",")).map(String::trim).collect(Collectors.toList());

		String[] intersect = num1.stream().filter(num2::contains).collect(Collectors.toList()).parallelStream()
				.toArray(String[]::new);

		StringBuilder sb = new StringBuilder();

		for (String str : intersect)
			sb.append(str).append(",");
		return sb.substring(0, sb.length() - 1);

	}

	public static void main(String[] args) {
		String[] str = { "1, 3, 4, 7, 13", "1, 2, 4, 13, 15" };
		System.out.println(FindIntersection(str));
		//output 1,4,13

	}
}
