package com.ibn;

public class LognestSubstring {

	public static int lengthOfLongestSubstring(String str) {
		String test = "";

		int maxLength = -1;
		if (str.isEmpty()) {
			return 0;
		} else if (str.length() == 1) {
			return 1;
		}
		for (char c : str.toCharArray()) {
			String current = String.valueOf(c);

			if (test.contains(current)) {
				test = test.substring(test.indexOf(current) + 1);
			}
			
			test = test + String.valueOf(c);
			maxLength = Math.max(test.length(), maxLength);
			
		}

		return maxLength;

	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcdb"));
	}

}
