package ioc.demo.one.service;

import java.util.Date;

public class DateService {
	static Date appLastStartedOn = new Date();
	
	public DateService(){
		System.out.println("appLastStartedOn :: "+appLastStartedOn);
	}
	
	public Date getDate() {
		return new Date();
	}

	public int getDay() {
		return new Date().getDate();
	}
}
