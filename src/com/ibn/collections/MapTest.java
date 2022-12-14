package com.ibn.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 11);
		map.put(3, 12);
		
//		System.out.println(map);
//		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
//		
//		for(Integer entry : map.keySet())
//			System.out.println(entry);
//		
//		for(Integer entry : map.values()) 
//			System.out.println(entry);
		
		map.entrySet().stream().forEach(System.out::println);
		
		map.keySet().stream().forEach(System.out::println);
		
	}

}
