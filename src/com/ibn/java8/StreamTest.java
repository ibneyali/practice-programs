package com.ibn.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	
	public static void main(String[] args) {
		
		System.out.println(orderitemReturn());
				
	}
	
	public static List<OrderItem> orderitemReturn(){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1L, "iPhone_12", 65000));
		productList.add(new Product(2L, "iPhone_13", 100000));
		
		List<OrderItem> r = productList.stream().map(p->mapToProduct(p)).collect(Collectors.toList());
		return r;
	}

	private static OrderItem mapToProduct(Product p) {
		OrderItem oi = new OrderItem();
		oi.setId(p.getId());
		oi.setOrderName(p.getProductName());
		oi.setOrderPrice(p.getPrice());
		return oi;
	}

}
