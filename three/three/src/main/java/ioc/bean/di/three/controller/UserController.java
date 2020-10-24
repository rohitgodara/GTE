package ioc.bean.di.three.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ioc.bean.di.three.config.DataSource;
import ioc.bean.di.three.entity.User;
import ioc.bean.di.three.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	ApplicationContext context = new ClassPathXmlApplicationContext("root.xml");
	UserService service = context.getBean("userService", UserService.class);
	DataSource source = context.getBean("dataSource", DataSource.class);

	@GetMapping("/")
	public List<User> findAll() {
		System.out.println(source.getClassName() + " :: " + source.getMaxConnection() + " :: " + source.getDbName()
				+ " :: " + source.getMinConnection());
		return service.findAll();
	}

}
