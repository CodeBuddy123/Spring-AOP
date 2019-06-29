package com.ashsoft.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MovieAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Method method, Object[] params, Object target, Exception e)
	{
		System.out.println("******************************************************************************************");
		System.out.println("Power Failure, Movie was Stopped.Please come to the counter,and Collect your Money.");
		System.out.println("******************************************************************************************");
	}
}
