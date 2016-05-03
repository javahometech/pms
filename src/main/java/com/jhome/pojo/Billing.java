package com.jhome.pojo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Billing {

	private Integer billNo;
	@NotEmpty
	private String custmerName;
	@NotEmpty
	private String productName;
	@NotNull
	private Double price;
	@NotNull
	private Double quantity;

	public Integer getBillNo() {
		return billNo;
	}

	public void setBillNo(Integer billNo) {
		this.billNo = billNo;
	}

	public String getCustmerName() {
		return custmerName;
	}

	public void setCustmerName(String custmerName) {
		this.custmerName = custmerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

}
