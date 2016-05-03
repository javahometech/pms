package com.jhome.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jhome.pojo.Product;

@Repository
public class ProductDaoImpl implements IProductDao {
	static Logger logger = Logger.getLogger(ProductDaoImpl.class);
	@Autowired
	private HibernateTemplate template;

	@Transactional
	public void addProduct(Product productPojo) {

		template.save(productPojo);
		System.out.println("dao cal...............");
		logger.debug("addproduct called");
	}

	@Transactional
	public List viewProduct() {
		System.out.println("viewproduct method in productiimpldao class");
		return template.find("from Product");

	}

}
