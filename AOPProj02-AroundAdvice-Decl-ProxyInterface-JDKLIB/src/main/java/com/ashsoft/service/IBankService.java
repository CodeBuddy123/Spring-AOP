package com.ashsoft.service;

public interface IBankService {
	
	public double calcSimpleInterest(double pAmt, double rate, double time);
	public double calcComInterest(double pAmt, double rate, double time);
}
