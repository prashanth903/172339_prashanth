package com.capg.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.capg.streams.Trader;
import com.capg.streams.Transaction;

public class TestTransaction {

	public static void main(String[] args) {
	
		List<Transaction> lt=new ArrayList<>();
		lt.add(new Transaction(new Trader("prashanth","Hyderabad"),2011,1000));
		lt.add(new Transaction(new Trader("mirza","Delhi"),2012,2000));
		lt.add(new Transaction(new Trader("onkar","Bangalore"),2013,1500));
		lt.add(new Transaction(new Trader("rohan","pune"),2014,3000));
		
		//Assignment question 8
		List<Transaction> trans=lt.stream()
				.filter(p->p.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());
		trans.forEach(t->System.out.println("transaction value: "+t.getValue()+" in the year "+t.getYear()+" done by "+t.getTrader().getName()));
		
		//Assignment question 13
		System.out.println("-------------------------------------------------");
		List<Transaction> trans2=lt.stream()
				.filter(t->t.getTrader().getCity()=="Delhi")
				.collect(Collectors.toList());
		trans2.forEach(e->System.out.println("Transaction value is: "+e.getValue()+" done by "+e.getTrader().getName()));
		
		//Assignment question 14
		System.out.println("-------------------------------------------------------------");
		Transaction max=lt.stream()
				.max((t1,t2)->Integer.compare(t1.getValue(), t2.getValue()))
				.get();
		System.out.println(max.getValue());
		
//		Assignment question 15
		System.out.println("---------------------------------------------------------------");
		Transaction max2=lt.stream()
				.min((t1,t2)->Integer.compare(t1.getValue(), t2.getValue()))
				.get();
		System.out.println(max2.getValue());
	}
	
	}

