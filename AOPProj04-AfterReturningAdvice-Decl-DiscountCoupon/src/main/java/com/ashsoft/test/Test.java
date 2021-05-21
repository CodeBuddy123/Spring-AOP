package com.ashsoft.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.service.OnlineStore;

public class Test {

	public static void main(String[] args) {
		
		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/ashsoft/cfgs/applicationContext.xml");
		
		OnlineStore proxy= ctx.getBean("store",OnlineStore.class);
		
		//Invoke business method
		try {
			System.out.println("Bill Amount:: "+proxy.shopping(new String[] {"cap","haleem","KP","Scent"}, 
					                                           new double[] {200,300,134000,10000}));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//close the container
		ctx.close();
	}

}
