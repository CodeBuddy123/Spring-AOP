package com.ashsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.ashsoft.service.BankService;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
		
		//Create IOC 
		
		ApplicationContext ctx = SpringApplication.run(Test.class, args);
		
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
		

	}

}
