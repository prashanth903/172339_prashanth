package com.app.person;

public class Person {
	String name;
	String Address;
	
	public Person(String name, String address) 
	{
		//super();
		this.name = name;
		Address = address;
	}

	
	public void setAddress()
	{
		this.Address=Address;
	}
	
	public String getName()
	{
		return name;
	}

	public String getAddress() 
	{
		return Address;
	}
 
	public String toString()
	{
		return  "From ToString method     Name:"+name+"  "+"Address:"+Address;
	}
	
}
