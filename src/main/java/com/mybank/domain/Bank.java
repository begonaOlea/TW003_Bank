package com.mybank.domain;

public class Bank {
	
	private static Customer[] customers;
	private static int numberCustomers;
	
	static {
		customers = new Customer[10];
		numberCustomers = 0;
	}
	
	private Bank() {
		
	}
	
	public static void addCustomer(String fn, String ln) {
		//falta validar lleno
		if (numberCustomers <= customers.length) {
			customers[numberCustomers] = new Customer(fn,ln);
			numberCustomers ++;
		}
	}
	
	public static int getNumberCustomers() {
		return numberCustomers;
	}
	
	public  static Customer getCustomer(int indice) {
		//falta validar
		return customers[indice];
	}
	
	

}
