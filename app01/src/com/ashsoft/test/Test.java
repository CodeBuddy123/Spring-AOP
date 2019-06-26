package com.ashsoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.beans.Employee;
import com.ashsoft.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/ashsoft/resources/applicationContext.xml");
		
		Employee emp=(Employee) context.getBean("empBean");
		
		EmployeeService employeeService=(EmployeeService) context.getBean("proxy");//Proxy Object contains Business methods with Aspects
		employeeService.displayEmployeeDetails(emp);
		System.out.println();  
		employeeService.getEmployeeDetails(emp);
	}

}
