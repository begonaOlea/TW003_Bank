package com.mybank.domain;

public class Account{
	
	private double balance;

	public Account(double initBalance) {
		super();
		if(initBalance > 0) {
			this.balance = initBalance;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt) {
		if (amt < 0 ) {
			return false;
		}
		this.balance += amt;
		return true;
	}
	
	public boolean withDraw(double amt) {
		
		if(amt < 0 || amt > balance) {
			return false;
		}
		this.balance -= amt;
		return true;
	}


}
