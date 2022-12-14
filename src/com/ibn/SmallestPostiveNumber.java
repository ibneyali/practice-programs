package com.ibn;

import java.util.Arrays;

public class SmallestPostiveNumber {

	public static int smallestPositive(int arr[]) {
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i + 1] == arr[i] + 1)) {
				if (i == arr.length - 2) {
					return arr[0] - 1;
				}
			} else if (arr[i + 1] != arr[i] + 1) {
				return arr[i] + 1;
			}
		}
		return n;
	}

	public static void main(String[] args) {

		int dummy[] = { -10, -7, 1, 2, 3, 5, 8, 15 };
		int[] arr = Arrays.stream(dummy).filter(x -> x >= 0).sorted().toArray();
		int n = SmallestPostiveNumber.smallestPositive(arr);
		System.out.println("Missing number is: " + n);

	}

}
