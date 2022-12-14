package com.ia.test;

import java.util.HashMap;
import java.util.Map;

class Key{
	Integer key;
	Key(Integer k){
		key = k;
	}
	public boolean equals(Object o) {
		return((Key)o).key == this.key;
	}
}
public class TestKeys {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		Key k1 = new Key(1);
		Key k2 = new Key(2);
		Key k3 = new Key(1);
		Key k4 = new Key(new Integer(2));
		map.put(k1, "car");
		map.put(k2, "boat");
		map.put(k3, "plane");
		map.put(k4, "hovercraft");
		System.out.println(map.size());
	}
}
