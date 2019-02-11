package com.app.customer;

public class Account extends Customer{
private String string;
public Account(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.Balance = balance;
	}
private int id;
private Customer customer;
private double Balance=0;
public Account() {
	super();
}

public Account(int id2, String string2, double balance2) {
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public double getBalance() {
	return Balance;
}
public void setBalance(double balance) {
	Balance = balance;
}
@Override
public String toString() {
	return "Account [id=" + id + ", customer=" + customer + ", Balance=" + Balance + "]";
}
public void deposit(double amount) {

	if(Balance>0) {
		Balance=amount+Balance;
	}else {
		System.out.println("amount is sufficient");
	}
}
public void withdraw(double amount) {
	if(amount<=Balance)
	{
		Balance=Balance-amount;
	}
	else {
		System.out.println("Amount withdrawn exceeds the current balance!");
	}
	
}
}
