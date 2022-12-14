package com.ibn;

@FunctionalInterface
public interface Func<T> {

	public void method1(T t);
	
	default void sss() {
		System.out.println("hh");
	}
}
