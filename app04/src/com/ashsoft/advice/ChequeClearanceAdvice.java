package com.ashsoft.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.ashsoft.beans.Account;
import com.ashsoft.beans.Cheque;

public class ChequeClearanceAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object[] params=mi.getArguments();  //getting business method parameters
		
		Account acc=(Account) params[0];
		Cheque cheque=(Cheque) params[1];
		
		//gets executed before business method
		System.out.println("Hello "+acc.getAccName()+"!,Cheque No "+cheque.getChequeNo()+" is coming for clearance with amount "+cheque.getAmount());
		
		mi.proceed(); //calls business method
		
		//gets executed after business method
		
		System.out.println("Hello "+acc.getAccName()+"!,Your account "+acc.getAccNo()+" is debited with amount "+cheque.getAmount()+" towards cheque clearance with no "+cheque.getChequeNo());
		System.out.println("Your account Balance is : "+acc.getBalance());
		
		return null;  
	}

}
