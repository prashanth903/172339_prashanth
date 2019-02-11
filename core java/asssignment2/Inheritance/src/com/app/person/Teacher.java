package com.app.person;

public class Teacher extends Person{
	private int numofcourses;
	private String courses[]= {"C++","OOPS","DBMS","FLAT"};
	
	public Teacher(String name,String Address)
	{
		super(name,Address);
	}
	public boolean addcourse(String course)
	{
		for(int i=0;i<courses.length;i++)
		{
		   if(course.equals(courses[i]))
		   {
			return false;
		   }
    	}
		return true;
	}
   public boolean removecourse(String course)
   {
	   for(int i=0;i<courses.length;i++)
		{
		   if(course.equals(courses[i]))
		   {
			return true;
		   }
         }
	   System.out.println("Sorry There is No course as Java");
	return false;
   }
   
   public String toString()
   {
	   return "Name:"+name+"Address:"+Address;
   }
}
