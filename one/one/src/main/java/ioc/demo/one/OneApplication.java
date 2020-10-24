package ioc.demo.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc.demo.one.service.DateService;

@SpringBootApplication
public class OneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	
//		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
//		
//		int noOfBeans = context.getBeanDefinitionCount();
//		System.out.println("noOfBeans :: "+noOfBeans);
//		DateService dateService = (DateService)context.getBean("dateBean");
//		System.out.println("Date is :: "+dateService.getDate());
	}

}
