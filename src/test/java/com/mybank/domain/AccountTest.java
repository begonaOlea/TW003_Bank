package com.mybank.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("..... iniciando pruebas");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(".... finalizo prueba");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println(".... incio una prueba");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("...........");
		
	}

	@Test
	public void testCrearCuentaSaldoIniNegLaCreaConSaldoCero() {
		double saldoIni = - 20;
		Account a = new Account(saldoIni);
		double saldoEsperado = 0;
		double saldoReal = a.getBalance();
		
		if(saldoEsperado != saldoReal ) {
			fail("El saldo debe ser cero");
		}
	}
	
	@Test
	public void testCrearCuentaSaldoIniPosLaCreaConEseSaldo() {
		double saldoIni =  20;
		Account a = new Account(saldoIni);
		double saldoEsperado = 20;
		double saldoReal = a.getBalance();
		
		if(saldoEsperado != saldoReal ) {
			fail("El saldo de ser " + saldoEsperado  + "pero es " + saldoReal);
		}
	}
	
	
	
	
	@Test
	public void testDepositarImpoteNegativo() {
	    //datos entrada
		double amt =  -200;
		Account a = new Account(100);
		//datos esperado 
		double saldoEsperado = 100;
		boolean respEsperada =false;
		
		//prueba
		boolean respReal = a.deposit(amt);
		double saldoReal = a.getBalance();
		
		if( respReal != respEsperada ||  saldoReal != saldoEsperado) {
			fail("No debe dejar hacer ingreso");
		}
	}
	
	
	
	
	
	
	
	
	

}
