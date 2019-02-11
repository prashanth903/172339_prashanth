package com.account;

public class Account {
	private String id;
	private String name;
	private int balance=0;

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public int credit(int amount) {
		balance=amount+balance;
		System.out.println("amount :"+getBalance());
		return balance;
	}
	public int debit(int amount) {
		if(amount<=balance)
		{
			balance=balance-amount;
		}else
		{
			System.out.println("amount exceeded balance");
		}
		return balance;
	}
	
	public int toTransfer(int account,int amount) {
	if(amount<=balance)	{
		System.out.println("transfer amount to account");
	}else
	{
		System.out.println("Amount exceded balance");
	}return balance;
	}
}
