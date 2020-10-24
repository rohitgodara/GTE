package com.setter.di.four.service;

import java.util.List;

import com.setter.di.four.dao.UserDao;
import com.setter.di.four.entity.User;

public class UserService {

	private UserDao dao;

	public List<User> findAll() throws Exception {
//		throw new RuntimeException("user not found");
		return dao.findAll();
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
