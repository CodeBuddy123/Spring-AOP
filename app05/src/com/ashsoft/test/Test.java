package com.ashsoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.beans.Employee;
import com.ashsoft.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/ashsoft/resources/applicationContext.xml");
		Employee emp= (Employee) context.getBean("empBean");
		EmployeeService empService=(EmployeeService) context.getBean("empService");
		String status="";
		try {
			status=empService.addEmployee(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(status);
	}

}
