package com.app.book;

import com.app.composition.Author;

public class Book{



public Book(String name, Author author, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.qty = qty;
	}
public Book(String name, Author string, double price, int qty) {
	
		this.name = name;
		this.author = string;
		this.price = price;
		this.qty = qty;
	}

private String name;
private Author author;
private double price;
private int qty=0;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
@Override
public String toString() {
	return "Book [name=" + name + "," +author + ", price=" + price + ", qty=" + qty + "]";
}


}
