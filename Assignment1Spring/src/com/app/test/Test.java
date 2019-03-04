package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.spring.Customer;

public class Test {
	public static void main(String[] args) {
		

	ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
	Object ob=ac.getBean("cust");
	Customer c=(Customer)ob;
	
	System.out.println(c);
	}
}
