package com.ashsoft.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pmAdvice")
@Aspect
public class PerformanceMonitioringAdvice {
	
	@Around(value = "execution(double com.ashsoft.service.BankService.*(..))")
	public Object performance(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Before Entering....");
		long start = System.currentTimeMillis();
		Object retVal = pjp.proceed(); //calls target method
		long end = System.currentTimeMillis();
		System.out.println("After exiting...");
		System.out.println(pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs())+" has taken "+(end-start)+" ms.");
		
		return retVal;
	}
}
