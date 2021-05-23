package com.ashsoft.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ashsoft.config.AppConfig;
import com.ashsoft.service.BankService;

public class Test {

	public static void main(String[] args) {
		
		//Create IOC 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
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
