package com.ashsoft.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.ashsoft.beans.Account;
import com.ashsoft.exception.InsufficientFundException;

@Component("aspect")
@Aspect
public class TransactionAspect {
	
	@Before("execution(* com.ashsoft.service.TransactionService.*(..))")
	public void before(JoinPoint jp)               //Before Advice Logic
	{
		Object[] params=jp.getArgs();
		Account acc=(Account) params[0];
		System.out.println("Before Advice: Intitial Balance:"+acc.getBalance());
	}
	
	@After("execution(* com.ashsoft.service.TransactionService.*(..))")
	public void after(JoinPoint jp)               //After Advice Logic
	{
		Object[] params=jp.getArgs();
		Account acc=(Account) params[0];
		System.out.println("After Advice: Total Balance:"+acc.getBalance());
	}
	
	@AfterReturning(pointcut="execution(* com.ashsoft.service.TransactionService.*(..))",returning="result")
	public void afterReturning(JoinPoint jp,String result)
	{
		System.out.println("After Returning Advice: Transaction Status:"+result);
	}
	
	@Around("execution(* com.ashsoft.service.TransactionService.*(..))")
	public void around(ProceedingJoinPoint jp)
	{
		System.out.println("Around Advice: Before: "+jp.getSignature().getName()+" Method Execution");
		String status="";
		try {
			status=(String) jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Around Advice: After: "+jp.getSignature().getName()+" Method Execution");
		System.out.println("Around Advice: Transaction Status:"+status);
	}
	
	@AfterThrowing(pointcut="execution(* com.ashsoft.service.TransactionService.*(..))",throwing="exception")
	public void afterThrowing(JoinPoint jp,InsufficientFundException exception)
	{
		System.out.println("After throwing Advice: "+exception.getClass().getName()+" In Transaction:"+exception.getMessage());
		
	}
}
