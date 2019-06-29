package com.ashsoft.service;

import com.ashsoft.beans.Account;
import com.ashsoft.beans.Cheque;

public interface TransactionService {
	public void deposit(Account acc,Cheque cheque);
}
