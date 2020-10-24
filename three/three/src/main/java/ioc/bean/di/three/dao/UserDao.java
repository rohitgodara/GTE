package ioc.bean.di.three.dao;

import java.util.ArrayList;
import java.util.List;
import ioc.bean.di.three.entity.User;

public class UserDao {

	private static UserDao dao = new UserDao();

	private UserDao() {
	}

	public static UserDao getInstance() {
		return dao;
	}

	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		users.add(new User("Rohit", "Delhi", 30));
		users.add(new User("Ritu", "Assam", 29));
		return users;
	}
}
