package com.ashsoft.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitioringAdvice {
	
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
