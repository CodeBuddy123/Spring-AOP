//Make sure u have aspectj-weaver.jar in Library
package com.ashsoft.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectBean {
   
	public void before(JoinPoint jp)
	{
		System.out.println("Before "+jp.getSignature().getName()+" method execution");
	}
	
	public void after(JoinPoint jp)
	{
		System.out.println("After "+jp.getSignature().getName()+" method execution");
	}
	
	public void afterReturning(JoinPoint jp,Object result)
	{
		System.out.println("After returning "+result+" from "+jp.getSignature().getName());
	}
	
	public void afterThrowing(JoinPoint jp,Throwable exception)
	{
		System.out.println("After throwing "+exception+" from "+jp.getSignature().getName());
	}
	
	public void around(ProceedingJoinPoint pjp)
	{
		System.out.println("Before "+pjp.getSignature().getName()+" method execution from around Advice");
		
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After "+pjp.getSignature().getName()+" method execution from around Advice");
	}
}
