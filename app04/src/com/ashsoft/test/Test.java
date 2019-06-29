package com.ashsoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.beans.Account;
import com.ashsoft.beans.Cheque;
import com.ashsoft.service.TransactionService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/ashsoft/resources/applicationContext.xml");
		Account acc= (Account) context.getBean("accBean");
		Cheque cheque=(Cheque) context.getBean("chequeBean");
		
		TransactionService trans_Service= (TransactionService) context.getBean("proxy");
		trans_Service.deposit(acc, cheque);

	}

}
