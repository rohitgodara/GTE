package ioc.bean.di.three.service;

import java.util.List;

import ioc.bean.di.three.dao.UserDao;
import ioc.bean.di.three.entity.User;

public class UserService {

	private UserDao dao;

	public UserService(UserDao dao) {
		super();
		this.dao = dao;
	}

	public List<User> findAll() {
		return dao.findAll();
	}
}
