package com.app.customer;

public class Customer {
private int discount;
public Customer(int iD, String name, int discount) {
		super();
		ID = iD;
		this.name = name;
		this.discount = discount;
	}
private int ID;
private String name;
private char gender;
public Customer() {
	super();
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Customer [ID=" + ID + ",name="+ name +"]";
}

}
