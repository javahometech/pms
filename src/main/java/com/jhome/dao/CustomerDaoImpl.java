package com.jhome.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jhome.pojo.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
	@Autowired
	private HibernateTemplate template;

	/*
	 * public List<Customer> searchCustomers(String custName) { System.out
	 * .println("this is the searchCusstomer method in CusstomerDaompl"); return
	 * null; }
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Customer> searchCustomers(String custName) {
		System.out.println("this is serchCustomers dao imp");
		Criteria criteria = template.getSessionFactory().openSession()
				.createCriteria(Customer.class);
		criteria.add(Restrictions.ilike("custName", custName + "%"));
		System.out.println("after citeria in searchCustomers");
		return criteria.list();

	}
}
