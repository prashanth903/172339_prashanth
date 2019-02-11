package com.app.person;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Teacher t=new Teacher("sai","Hyderabad");	
		Student s=new Student("Prashanth","Medchal", 4);
		Person p=new Person("Mirza","Bangalore");
		System.out.println("Person class details");
		System.out.println("Name::"+p.getName());
		System.out.println("\nAddress::"+p.getAddress());
		System.out.println(p.toString());
	System.out.println("\n");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Teacher Course");
	String course=sc.next();
	System.out.println(t.addcourse(course));
	System.out.println("\n");
	System.out.println("Enter A course to remove");
	String course1=sc.next();
	System.out.println(t.removecourse(course1));
	System.out.println(t.toString());
s.addcoursegrade();
s.printgrade();
s.avggrade();
	

	}

}
