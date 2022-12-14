package com.ibn.java8;

import java.util.ArrayList;
import java.util.List;

class Test{
	public static void methodReference(int a, int b) {
		System.out.println("This is test of method referencing");
	}
}

public class MethodReferenceOrDoubleColon {

	// static function to be called
	static void someFunction(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		FunctionalInterfaceTest<Integer, Integer> f = Test::methodReference;
		f.testMethod(10, 10);

		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");

		// call the static method

		// using normal method
		for (String s : list) {
			someFunction(s);
		}

		// using lambda expression
		list.forEach(s -> someFunction(s));

		// using double colon operator
		list.forEach(MethodReferenceOrDoubleColon::someFunction);

	}
}
