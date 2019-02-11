package com.app.account1;

import com.account.Account;

public class Account1 {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setId("123");
		a1.setName("sai krishna");
		a1.setBalance(100);
System.out.println("Account exists");
a1.getId();
a1.getName();
a1.getBalance();
a1.credit(150);
a1.debit(50);
a1.toTransfer(500,20);
System.out.println("id "+a1.getId());
System.out.println("name "+a1.getName());
System.out.println("balance "+a1.getBalance());
System.out.println(a1.toString());
	}

}
