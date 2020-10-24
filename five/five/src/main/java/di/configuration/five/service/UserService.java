package di.configuration.five.service;

import java.util.List;

import di.configuration.five.dao.UserDao;
import di.configuration.five.entity.User;

public class UserService {

	private UserDao dao;

	// idref is basically used when we want to inject a bean name as a string to
	// another bean and make sure this bean exist before creating the target bean
	private String daoName;

	public String getDaoName() {
		return daoName;
	}

	public void setDaoName(String daoName) {
		this.daoName = daoName;
	}

	public List<User> findAll() throws Exception {
		System.out.println("repository name :: " + this.getDaoName());
		return dao.findAll();
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
