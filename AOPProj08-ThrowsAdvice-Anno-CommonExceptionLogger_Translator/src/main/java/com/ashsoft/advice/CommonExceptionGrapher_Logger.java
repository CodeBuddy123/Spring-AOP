package com.ashsoft.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.ashsoft.exception.InternalProblemException;

@Component
@Aspect
public class CommonExceptionGrapher_Logger {
	
	@AfterThrowing(value="execution(double com.ashsoft.service.ShoppingStore.*(..))",throwing = "iae")
	public void exceptionLogger(JoinPoint jp, IllegalArgumentException iae) throws Throwable {
		
		//common exception logging
		Writer writer = new FileWriter("G:\\expLogger.txt",true);
		
		writer.write(jp.getSignature()+" with Args"+Arrays.toString(jp.getArgs())+" has raised exception "+iae);
		
		writer.flush();
		writer.close();
		//exception translation/graphing
		throw new InternalProblemException(jp.getSignature()+" with Args"+Arrays.toString(jp.getArgs())+" has raised exception "+iae);
	}
}
