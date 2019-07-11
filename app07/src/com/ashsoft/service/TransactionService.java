package com.ashsoft.service;

import com.ashsoft.beans.Account;
import com.ashsoft.exception.InsufficientFundException;

public interface TransactionService {
	public String withDraw(Account account,int wd_Amount) throws InsufficientFundException;
}
