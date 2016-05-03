package com.jhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jhome.dao.ICustomerDao;
import com.jhome.pojo.Customer;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerDao dao;

	@RequestMapping(value = "/searchcustomer", method = RequestMethod.GET)
	public String searchCustomers(@ModelAttribute("customer") Customer customer) {

		System.out
				.println("this is searchCustomers method in product controller class");
		return "searchcustomer";
	}

	@RequestMapping(value = "/searchcustomer", method = RequestMethod.POST)
	public String searchCustomer(@RequestParam("custName") String name,
			@ModelAttribute("customer") Customer custName, ModelMap map) {
		map.put("customersList", dao.searchCustomers(name));

		System.out
				.println("this is searchCustomer method in product controller class");

		return "searchcustomer";
	}
}
