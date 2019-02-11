package com.app.person;

public class Student extends Person {
	int sum=0;
	  int count=0;

int noofcourses;
String courses[]= {"CSS","ECE","EEE","MECH","CIVIL"};
int grades[]= {70,55,60,89,77};

public Student(String name,String Address,int noofcourses)
{
	super(name,Address);
	this.noofcourses=noofcourses;
}
public void addcoursegrade()
{
	 System.out.println("STUDENT COURSES ARE::");
	 for(int i=0;i<courses.length;i++)
	 {
		 System.out.println(courses[i]);
	 }
	 
}
public void printgrade()
{
	  	 System.out.println("STUDENT GRADES ARE::");
	 for(int i=0;i<grades.length;i++)
	 {
		 sum=sum+grades[i];
		 count++;
		System.out.println(grades[i]);
	 }
}
public double avggrade()
{
	 
	 double avg=sum/count;
	 System.out.println("AVERAGE GRADE IS::"+avg);
	return avg;
}
public String toString()
{
	return "Name:"+name+"   "+"Address:"+Address;
}

}
