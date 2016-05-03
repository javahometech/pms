package com.jhome.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

import com.jhome.dao.IProductDao;
import com.jhome.pojo.Product;

@Controller
 public class ProductController {
	@Autowired
	private IProductDao dao;

	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public void viewProduct(@ModelAttribute("prod") Product productPojo) {
		System.out.println("this is the product get method");
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(
			@Valid @ModelAttribute("prod") Product productPojo,
			BindingResult result) {
		if (result.hasErrors()) {
			return "addProduct";
		}
		dao.addProduct(productPojo);
		System.out.println("this is the product post method");
		return "success";
	}

	@RequestMapping(value = "/viewProduct", method = RequestMethod.GET)
	public String viewProduct(@ModelAttribute("product") Product productPojo,
			ModelMap map) {
		map.put("productlist", dao.viewProduct());
		return "viewProduct";
	}
	//for handling the exceptions
	@ExceptionHandler(Exception.class)
	public	String exception(Exception e) {
		// TODO Auto-generated method stub
		
		System.out.println("this is from exception method in Employee controller ");

		return "addProduct";
	}

}
