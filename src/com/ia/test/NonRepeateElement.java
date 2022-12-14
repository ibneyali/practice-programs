package com.ia.test;

public class NonRepeateElement {

	static int uniqueEle(int array[], int n) {
		int i, j;
		int count = 1;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (array[i] == array[j] && i != j)
					break;
			}
			if (j == n) {
				
				System.out.print(array[i]+" ");
				++count;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr [] = {2,3,4,2,8,12,8};
		uniqueEle(arr, arr.length);
	}
}
