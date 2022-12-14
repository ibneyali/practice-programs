package com.ibn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {

		Integer arr[] = {1,2,4,7,12,900};
		List<Integer> rt = Arrays.asList(arr);
		
		Stream.of("ali", "ibney", "ali", "ibneyali").filter(s -> s.equals("ali") || s.contains("ali"))
				.forEach(System.out::println);

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ibney");
		map.put(2, "ali");
		map.put(3, "software developer");
		map.put(4, "hansen technologies");
		map.put(4, "hansen technologies1");
//		for(String s : map.values()) {
//			System.out.println(s);
//		}
//		
//		for(Integer s : map.keySet()) {
//			System.out.println(s);
//		}
//
//		for(Map.Entry<Integer, String> m: map.entrySet()) {
//			System.out.println(m.getKey());
//		}

		map.entrySet().stream().filter(a -> a.getKey() == 4).map(b -> b.getValue().toUpperCase())
				.forEach(c -> System.out.println(c));

		List<String> s2 = map.values().stream().map(r -> r.toUpperCase()).collect(Collectors.toList());

		System.out.println(s2);

		// list.stream().filter(x -> x >= 13).forEach(System.out::println);

		List<String> str = new ArrayList<String>();
		str.add("Ibney");
		str.add("Ali Bhai");
		str.add("Software Engineer");

//		for (String string : str) {
//			System.out.println(string.toUpperCase());
//		}

		str.stream().forEach(a -> System.out.println(a.toUpperCase()));

	}

}
