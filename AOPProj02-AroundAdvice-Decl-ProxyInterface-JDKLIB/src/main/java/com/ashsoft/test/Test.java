package com.ashsoft.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.service.BankServiceImpl;
import com.ashsoft.service.IBankService;

public class Test {

	public static void main(String[] args) {
		
		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/ashsoft/cfgs/applicationContext.xml");
		
		//get proxy class object
		
		IBankService proxy = ctx.getBean("bankService",IBankService.class);
		
		System.out.println(proxy.getClass().getSuperclass());
		System.out.println(proxy.getClass());
		System.out.println(Arrays.toString(proxy.getClass().getInterfaces()));
		
		
		//invoke the methods
		System.out.println("Simple Interest Amount: "+proxy.calcSimpleInterest(100000, 2, 12));
		
		
		System.out.println("-----------------------------------");
		
		System.out.println("Compund Interest Amount: "+proxy.calcComInterest(100000, 2, 12));
		
		
		//close the container
		ctx.close();

	}

}
