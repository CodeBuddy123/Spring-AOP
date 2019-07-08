package com.ashsoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.beans.Show;
import com.ashsoft.service.ShowService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/ashsoft/resources/applicationContext.xml");
		Show show=(Show) context.getBean("showBean");
		ShowService showService=(ShowService) context.getBean("showService");
		showService.runShow(show);
	}
}
