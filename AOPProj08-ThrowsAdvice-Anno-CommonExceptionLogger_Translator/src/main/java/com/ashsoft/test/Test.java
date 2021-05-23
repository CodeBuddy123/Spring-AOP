package com.ashsoft.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.exception.InternalProblemException;
import com.ashsoft.service.ShoppingStore;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/ashsoft/cfgs/applicationContext.xml");
		
		//get Proxy class object
		ShoppingStore proxy = ctx.getBean("store",ShoppingStore.class);
		
		//invoke business method
		try {
			System.out.println("Bill Amount:: "+proxy.calcBillAmount(40000, 2));
		} catch (InternalProblemException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Bill Amount:: "+proxy.calcBillAmount(40000, 0));
		} catch (InternalProblemException e) {
			e.printStackTrace();
		}
		
		//close the container
		ctx.close();
	}

}
