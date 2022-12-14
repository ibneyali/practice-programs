package com.ibn;

public class ReverseString {

	public static void main(String[] args) {
		Integer[] arr = {0,2,4,0,0,0,4,5,0,1};
		int j = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
