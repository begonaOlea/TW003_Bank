package com.mybank.domain;

public class Pruebas {
	
	public static void main(String[] args) {
		Customer c = new Customer("Luis","Ramos");
		System.out.println(c); //c.toString();
		
		System.out.println(c.getFName().toUpperCase());
		
		String s = new String("Hola");
		System.out.println(s.toString());
	}

}
