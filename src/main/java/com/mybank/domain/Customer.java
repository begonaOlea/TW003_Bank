package com.mybank.domain;

public class Customer {
	
	private String fName;
	private String lName;
	private Account account;
	
	//private int id;
	//private boolean activo;

	
	//constructorer
	public Customer(String fName, 
			String lName) {
		super();
		
		//VALIDAR no null
		this.fName = fName;
		this.lName = lName;
		this.account = new Account(0);
	}

	public String getFName() {
		return fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [fName=" + fName + 
				", lName=" + lName + 
				", account=" + account.getBalance() + "]";
	}

	
	
	

}
