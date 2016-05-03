package com.jhome.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jhome.pojo.User;
@Repository
public class LoginDaoImpl implements ILoginDao {

	@Autowired
	private HibernateTemplate template;

	public User findUser(User loginUser) {
		return template.get(User.class, loginUser.getUserName());
	}

}
