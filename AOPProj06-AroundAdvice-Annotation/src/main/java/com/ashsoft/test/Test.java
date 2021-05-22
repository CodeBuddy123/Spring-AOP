package com.ashsoft.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.service.BankService;

public class Test {

	public static void main(String[] args) {
		
		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/ashsoft/cfgs/applicationContext.xml");
		
		//get proxy class object
		
		BankService proxy = ctx.getBean("bank",BankService.class);
		
		System.out.println(proxy.getClass().getSuperclass());
		System.out.println(proxy.getClass());
		//invoke the methods
		System.out.println("Simple Interest Amount: "+proxy.calcSimpleInterest(100000, 2, 12));
		
		System.out.println("--------------------------------");
		System.out.println("Simple Interest Amount: "+proxy.calcSimpleInterest(100000, 2, 12));
		
		System.out.println("-----------------------------------");
		
		System.out.println("Compund Interest Amount: "+proxy.calcComInterest(100000, 2, 12));
		
		System.out.println("--------------------------------");
		System.out.println("Compound Interest Amount: "+proxy.calcComInterest(100000, 2, 12));
		
		//close the container
		ctx.close();

	}

}
