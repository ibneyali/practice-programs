package com.ibn.java8;

import java.util.function.Predicate;

interface PerformOperation {
	boolean check(int a);
}

public class EvenAndOdd {

	public static void main(String[] args) {

		Predicate<Integer> eo = a -> {
			if (a % 2 == 0) {
				return true;
			}
			return false;
		};
		System.out.println(eo.test(13));

		Predicate<Integer> pr = a -> {
			if (a == 1)
				return false;
			for (int i = 2; i < a; i++) {
				if (a % i == 0)
					return false;
			}
			return true;

		};

		Predicate<Integer> pal = a -> {
			int rev = 0;
			int rem = 0;
			while (a != 0) {
				rem = a % 10;
				rev = rev * 10 + rem;
				a /= 10;
			}
			if (a == rev)
				return true;
			else
				return false;

		};

		System.out.println(pr.test(1));
	}

}
