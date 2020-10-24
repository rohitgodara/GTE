package di.configuration.five.dao;

import java.util.ArrayList;
import java.util.List;

import di.configuration.five.entity.User;

public class UserDao {
	private static UserDao dao = new UserDao();

	private UserDao() {
	}

	public static UserDao getInstance() {
		return dao;
	}

	public List<User> findAll() throws Exception {
		List<User> users = new ArrayList<User>();
		users.add(new User("Rohit", "Delhi", 30));
		users.add(new User("Ritu", "Assam", 29));
		return users;
	}
}
