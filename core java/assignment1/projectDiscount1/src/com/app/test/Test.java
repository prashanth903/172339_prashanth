package com.app.test;

import java.util.Scanner;

import com.app.disrate.DiscountRate;
import com.app.visit.Visit;
import com.cust.Customer;

public class Test {

	public static void main(String[] args) {
	Customer c=new Customer();
	System.out.println("enter the member type");
	Scanner sc=new Scanner(System.in);
	c.setMemberType(sc.next());
	//c.setMember(false);
	//c.setMemberType("Premium");
	
	c.setName("mirza");
	//c.setMemberType("Gold");
	//c.setMemberType("Silver");
	
//System.out.println("this is"+c.getMemberType());
	Visit v=new Visit();
	v.setServiceExpense(3.0);
	v.setProductExpense(4.0);

	DiscountRate ds=new DiscountRate();
	System.out.println("product discount is"+ds.getProductDiscountRate("premium"));
	System.out.println("service discount is"+ds.getServiceDiscountRate("premium"));
	System.out.println(c.toString());
	System.out.println("membertype=  "+c.getMemberType()
			+ "\nserviceexpense is "+v.getServiceExpense()
			+"\nproductexpense is "+v.getProductExpense()
			+" \ndiscount is=  "+ds.getServiceDiscountRate("Gold"));
	System.out.println("total expense is "+v.getTotalExpense());
	//System.out.println("membertype=  "+c.getMemberType()+"serviceexpense is "+v.getServiceExpense()+" discount is=  "+ds.getServiceDiscountRate("Gold"));
	
	}

}
