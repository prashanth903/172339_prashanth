package com.app.customer;

public class Test {

	public static void main(String[] args) {
		Customer c=new Customer(123,"sai",'m');
		Account a= new Account(12,c,100);
		a.deposit(300);
		a.withdraw(200);
		System.out.println(a.toString());
	}

}
