package com.ashsoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.beans.Account;
import com.ashsoft.service.TransactionService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/ashsoft/resources/applicationContext.xml");
		Account acc= (Account) context.getBean("accBean");
		TransactionService tx_Service= (TransactionService) context.getBean("transaction");
		try {
			tx_Service.withDraw(acc, 5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
