package com.capg.imdb;

public class Register {

	private String Name;
	private String Email;
	private String password;
	private int Phone_No;
	public Register() {
		super();
	}
	public Register(String name, String email, String password, int phone_No) {
		super();
		Name = name;
		Email = email;
		this.password = password;
		Phone_No = phone_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(int phone_No) {
		Phone_No = phone_No;
	}
	@Override
	public String toString() {
		return "Register [Name=" + Name + ", Email=" + Email + ", password=" + password + ", Phone_No=" + Phone_No
				+ "]";
	}


}
