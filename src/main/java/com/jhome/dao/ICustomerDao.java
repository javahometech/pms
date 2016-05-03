package com.jhome.dao;

import java.util.List;

import com.jhome.pojo.Customer;

public interface ICustomerDao {
	
	public List<Customer> searchCustomers(String custName);
	

}
