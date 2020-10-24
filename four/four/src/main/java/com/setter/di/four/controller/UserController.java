package com.setter.di.four.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.setter.di.four.entity.User;
import com.setter.di.four.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	ApplicationContext context = new ClassPathXmlApplicationContext("root.xml");
	UserService service = context.getBean(UserService.class);

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<User> users = service.findAll();
			result.put("users", users);
			result.put("isError", false);
			result.put("timestamp", new Date());
			result.put("message", null);
			return new ResponseEntity<Object>(result, HttpStatus.OK);
		} catch (Exception e) {
			result.put("users", null);
			result.put("isError", true);
			result.put("timestamp", new Date());
			result.put("message", e.getMessage());
			return new ResponseEntity<Object>(result, HttpStatus.NOT_FOUND);
		}

	}

}
