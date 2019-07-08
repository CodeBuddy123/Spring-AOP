package com.ashsoft.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class ShowAspect {
	
	public void before()
	{
		System.out.println("Get Tickets for the Show");
	}
	public void after()
	{
		System.out.println("Please Quit the Hall in Queue");
	}
	public void around(ProceedingJoinPoint jp)
	{
		System.out.println("Show is About to Start, Please Kindly Switch off your Mobile");
		try {
			jp.proceed();
		} catch (Throwable e) {
		   e.printStackTrace();
		}
		System.out.println("Please Check your Belongings Before you leave the Hall");
	}
	public void afterReturning()
	{
		System.out.println("Thank you for attending the Show");
	}
	public void afterThrowing()
	{
		System.out.println("Show is Interrupted as it is not Mimicry Show");
	}
}
