package ioc.bean.autowiring.two.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ioc.bean.autowiring.two.model.User;
import ioc.bean.autowiring.two.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	ApplicationContext context = new ClassPathXmlApplicationContext("root-beans.xml");
	UserService service = context.getBean("userService", UserService.class);

	
	@GetMapping("/")
	public List<User> findAll() {
		return service.findAll();
	}

}
