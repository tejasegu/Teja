package com.teja.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAccountController {
	private BankAccount account;
	public BankAccountController() {
		
	}
	public BankAccountController(BankAccount account) {
		super();
		this.account = account;
	}
	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	
	
	
	public double withdraw(long accountId, double balance)
	{
		double amountLeft = account.getAccountBalance()-balance;
		account.setAccountBalance(amountLeft);
		return amountLeft;
	}
	public double deposit(long accountId, double balance)
	{
		double totalAmount = account.getAccountBalance()+balance;
		account.setAccountBalance(totalAmount);
		return totalAmount;
	}
	public double getBalance(long accountId)
	{
		return account.getAccountBalance();
	}
/*	public boolean fundTransfer(long fromAccount, long toAccount, double amount)
	{
		
	} */

	@Override
	public String toString() {
		return "BankAccountController [account=" + account + "]";
	}
}
