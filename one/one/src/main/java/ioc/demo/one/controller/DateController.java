package ioc.demo.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ioc.demo.one.service.DateService;

@RestController
public class DateController {
	
	@Autowired
	private ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
	DateService dateService = (DateService)context.getBean("dateBean");
	
	@GetMapping("/date")
	public String getDate() {
		return dateService.getDate().toString();
	}

}
