package com.jhome.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jhome.pojo.Billing;

@Repository
public class IBillDaoImpl implements IBillDao {
	@Autowired
	HibernateTemplate template;

	@Transactional
	public Billing billSaveAndGet(Billing bill) {

		template.save(bill);
		return template.get(Billing.class, bill.getBillNo());
	}

}
