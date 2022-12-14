package com.ibn;

import java.util.function.BiFunction;

public class CP {
	public static void main(String[] args) {

		BiFunction<String, String, Boolean> compareString = (x, y) -> x.equals(y);

		System.out.println(compareString.apply("java8", "java8"));
	}
}
