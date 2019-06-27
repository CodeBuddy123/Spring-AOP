package com.ashsoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.beans.Student;
import com.ashsoft.service.InstituteService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/ashsoft/resources/applicationContext.xml");
		Student std= (Student) context.getBean("stdBean");
	    InstituteService inst_Service= (InstituteService) context.getBean("proxy");
	    
	    inst_Service.enquiry(std, "Java");
	    inst_Service.registration(std,"Oracle");
	}

}
