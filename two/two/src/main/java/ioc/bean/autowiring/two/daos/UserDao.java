package ioc.bean.autowiring.two.daos;

import java.util.ArrayList;
import java.util.List;

import ioc.bean.autowiring.two.model.User;

public class UserDao {

	private static UserDao dao = new UserDao();

	private UserDao() {
	}

	public static UserDao getInstance() {
		return dao;
	}

	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Rohit", "Delhi"));
		users.add(new User(2, "Ritu", "Assam"));
		return users;
	}
}
