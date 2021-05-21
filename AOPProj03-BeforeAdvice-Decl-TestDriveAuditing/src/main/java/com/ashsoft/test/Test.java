package com.ashsoft.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.service.CarShowRoom;

public class Test {

	public static void main(String[] args) {
		
		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/ashsoft/cfgs/applicationContext.xml");
		
		//get proxy class object
		CarShowRoom proxy = ctx.getBean("showroom",CarShowRoom.class);
		
		System.out.println(proxy.getClass()+"--->"+proxy.getClass().getSuperclass());
		
		try {
			System.out.println(proxy.sellCar("beleano", 1200000, "ASHISH"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("================================");
		
		try {
			System.out.println(proxy.sellCar("maruti", 1500000, "Raja"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//close the container
		ctx.close();
	}

}
