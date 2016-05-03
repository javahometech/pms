package com.jhome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhome.dao.ILoginDao;
import com.jhome.pojo.User;

@Service
public class LoginService implements ILoginService {
	@Autowired
	ILoginDao dao;
	public boolean authenticate(User user) {
		User dbUser = dao.findUser(user);
		if(dbUser == null){
			return false;
		}
		if(dbUser.getPassword().equals(user.getPassword())){
			return true;
		}
		return false;
	}

}
