package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.spring.List1;
import com.app.spring.Map1;
import com.app.spring.Set1;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
	Object ob=ac.getBean("q");
	List1 qs=(List1) ob;
	System.out.println(qs);
	qs.show();
	
	//set
	Object ob1=ac.getBean("quest1");
	Set1 qs1=(Set1) ob1;
	System.out.println(qs1);
	qs1.show1();

//map
	Object ob2=ac.getBean("quest2");
	Map1 m1=(Map1)ob2;
	System.out.println(m1);
	}

	
}
