package com.jhome.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Product {
 
	private Integer productId;
	@NotEmpty(message="it is mandatory field")
	@Size(max=7, min=4)
	private String productName;
	@NotNull
	private Double productCost;
	@NotNull
	private Integer quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productName, Double productCost, Integer quantity) {
		this.productName = productName;
		this.productCost = productCost;
		this.quantity = quantity;
	}

	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductCost() {
		return productCost;
	}
	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
}
