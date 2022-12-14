package com.ibn.java8;

public class Product {
	
	private Long id;
	private String productName;
	private Integer price;
	
	
	public Product() {
	}
	public Product(Long id, String productName, Integer price) {
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
