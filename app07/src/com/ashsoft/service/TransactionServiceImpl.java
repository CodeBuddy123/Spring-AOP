package com.ashsoft.service;

import org.springframework.stereotype.Component;

import com.ashsoft.beans.Account;
import com.ashsoft.exception.InsufficientFundException;

@Component("transaction")
public class TransactionServiceImpl implements TransactionService {

	@Override
	public String withDraw(Account account, int wd_Amount) throws InsufficientFundException {
		String status="";
		if(account.getBalance()>wd_Amount)
		{
			int total_Bal=account.getBalance()-wd_Amount;
			account.setBalance(total_Bal);
			status="Success";
		}
		else
		{
			status="Failure";
			throw new InsufficientFundException("Funds not Sufficient in Account");
		}
		return status;
	}

}
