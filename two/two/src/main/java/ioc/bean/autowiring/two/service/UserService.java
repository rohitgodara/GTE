package ioc.bean.autowiring.two.service;

import java.util.List;

import ioc.bean.autowiring.two.daos.UserDao;
import ioc.bean.autowiring.two.model.User;

public class UserService {

	private UserDao dao;

	public List<User> findAll() {
		return dao.findAll();
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
