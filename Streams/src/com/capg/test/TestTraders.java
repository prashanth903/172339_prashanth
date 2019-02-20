package com.capg.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.capg.streams.Trader;

public class TestTraders {

	public static void main(String[] args) {

		List<Trader> list3=new ArrayList<>();
	list3.add(new Trader("prashanth","Hyderabad"));
	list3.add(new Trader("mirza","Bhopal"));
	list3.add(new Trader("Rohit","Indore"));
	list3.add(new Trader("onkar","Bangalore"));
	list3.add(new Trader("sai","Hyderabad"));
	list3.add(new Trader("rohan","pune"));
	list3.add(new Trader("shayam","pune"));
	List<String> lss=list3.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
	lss.forEach(System.out::println);
	
	System.out.println("-----------------------------------------------------------");
	
	List<Trader> ls2=list3.stream().filter(t->t.getCity()=="pune").sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
	ls2.forEach(System.out::println);
	System.out.println("-----------------------------------------------------------");

	
	List<Trader> names=list3.stream()
			.sorted(Comparator.comparing(Trader::getName))
			.collect(Collectors.toList());
	
	//names.forEach(System.out::println);
	
	String s=names.stream()
			.map(Trader::getName)
			.collect(Collectors.joining(", "));
	System.out.println(s);
	System.out.println("-----------------------------------------------------------");

	List<String> ls1=list3.stream()
			.filter(t->t.getCity()=="Indore").sorted(Comparator.comparing(Trader::getName))
.map(Trader::getName)
			.collect(Collectors.toList());
	ls1.forEach(System.out::println);
	}
}
		