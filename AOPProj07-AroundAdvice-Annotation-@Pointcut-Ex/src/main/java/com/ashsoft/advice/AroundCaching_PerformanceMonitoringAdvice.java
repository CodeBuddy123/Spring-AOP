package com.ashsoft.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("cacheAdvice")
@Aspect
public class AroundCaching_PerformanceMonitoringAdvice {
	
	private Map<String, Object> cacheMap = new HashMap<>();
	
	@Pointcut(value ="execution(double com.ashsoft.service.BankService.*(..))" )
	public void myPtc()
	{
		
	}
	@Around(value="myPtc()")
	@Order(10)
	public Object caching(ProceedingJoinPoint pjp) throws Throwable{
		//prepare key
		String key = pjp.getSignature()+Arrays.deepToString(pjp.getArgs());
		
		Object retVal = null;
		//check in cache
		if(!cacheMap.containsKey(key))
		{
			retVal=pjp.proceed(); //invoke target method
			cacheMap.put(key,retVal); //put results in cache
			System.out.println("from target method");
		}
		else
		{
			retVal=cacheMap.get(key); //gather results from cache
			System.out.println("from cache");
		}
		
		return retVal;
	}
	@Order(20)
	@Around(value="myPtc()")
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
