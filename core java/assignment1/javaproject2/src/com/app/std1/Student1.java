package com.app.std1;

import java.util.Scanner;

import com.app.std.Student;

public class Student1 {


public static void main(String[] args) {
	Student s=new Student();
	s.setName("sai");
	s.setAddress("4-48");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("name is ");
	String name=sc.next();
	
	s.addCourseGrade("java", 10);
	s.addCourseGrade("python",20);
	s.addCourseGrade("php", 12);
	System.out.println("name is "+s.getName());
	System.out.println("address is"+s.getAddress());
s.printGrades();
System.out.println(s.getAvgGrade());
System.out.println(s.toString());
}
}
