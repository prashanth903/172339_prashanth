package com.app.test;

import com.app.book.Book;
import com.app.composition.Author;

public class Test {

	public static void main(String[] args) {
		
		Author a=new Author("prashanth","mirza@gmail.com",'m');
		
       // System.out.println(a.toString());
        
        Book b=new Book("prashanth",a, 100, 2);
        System.out.println(b.toString());
        //System.out.println("gender is"+a.getGender());
        
	}

}
