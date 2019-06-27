package com.ashsoft.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.ashsoft.beans.Student;

public class ThanqAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] params, Object target) throws Throwable {
		
		Student std=(Student) params[0]; //getting Student parameter
		String courseName=(String) params[1]; //getting String parameter
		
		System.out.println("*******************************************************************************");
		System.out.println("Thanq "+std.getSname()+" for your course "+method.getName()+" On "+courseName+",");
		System.out.println("AshishSoft Team will Contact you Shortly.");
		System.out.println("*******************************************************************************");
	}

}
