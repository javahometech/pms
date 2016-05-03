package com.jhome.dao;

import java.util.List;

import com.jhome.pojo.Customer;
import com.jhome.pojo.Product;

public interface IProductDao {
	public void addProduct(Product productPojo);

	public List viewProduct();

	

}
