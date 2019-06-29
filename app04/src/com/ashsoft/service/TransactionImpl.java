package com.ashsoft.service;

import com.ashsoft.beans.Account;
import com.ashsoft.beans.Cheque;

public class TransactionImpl implements TransactionService {

	@Override   //Business method
	public void deposit(Account acc, Cheque cheque) {
		int initial_Balance=acc.getBalance();
		int debit_amount=cheque.getAmount();
		int total_amount=initial_Balance-debit_amount;
		acc.setBalance(total_amount);
		System.out.println("Transaction Success");
	}
}
