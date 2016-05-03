package com.jhome.dao;

import org.springframework.stereotype.Service;

import com.jhome.pojo.User;
@Service
public interface ILoginDao {
	public User findUser(User loginUser);
}
