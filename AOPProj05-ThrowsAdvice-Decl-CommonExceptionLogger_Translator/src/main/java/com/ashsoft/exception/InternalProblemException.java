package com.ashsoft.exception;

public class InternalProblemException extends RuntimeException {
	
	public InternalProblemException(String errorMessage)
	{
		super(errorMessage);
	}
}
