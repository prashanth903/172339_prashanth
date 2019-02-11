package com.app.std;

public class Student {
private String name;
private String address;
private int numCourses;
private String courses[]= new String[30];
private int grades[]= new int[30];
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return name + "(" + address + ")";
}
public void student(String name,String address)
{this.name = name;
this.address = address;
	}
public int addCourseGrade(String course,int grade)
{
	courses[numCourses] = course;
    grades[numCourses] = grade;
    return ++numCourses;
	
	}
public void printGrades() {
	
    for (int i = 0; i < numCourses; ++i) {
       System.out.println("course is " + courses[i] + ":" + grades[i]);
    }
	
}
public double getAvgGrade() {
	int sum = 0;
    for (int i = 0; i < numCourses; ++i) {
       sum =sum+ grades[i];
    }
    return (double)sum/numCourses;
}

}