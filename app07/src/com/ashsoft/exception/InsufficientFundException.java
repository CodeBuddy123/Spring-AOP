package com.ashsoft.exception;

@SuppressWarnings("serial")
public class InsufficientFundException extends Exception {
	public InsufficientFundException(String error_Msg) {
		super(error_Msg);
	}
}
