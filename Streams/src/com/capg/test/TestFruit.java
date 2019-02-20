package com.capg.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.capg.streams.Fruit;

public class TestFruit {

	public static void main(String[] args) {

List<Fruit> list=new ArrayList<>();
list.add(new Fruit("Mango",100,10,"yellow"));
list.add(new Fruit("apple",150,50,"red"));
list.add(new Fruit("orange",70,15,"orange"));
list.add(new Fruit("watermelon",50,60,"red"));
list.add(new Fruit("grapes",120,80,"green"));

List<String> l=list.stream().filter(f->f.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed())
					.map(Fruit::getName)
					.collect(Collectors.toList());
	l.forEach(System.out::println);
	//System.out.println(l);
	System.out.println("--------------------------------------------------------");
	
	List<Fruit> l2=list.stream().sorted(Comparator.comparing(Fruit::getColor)).collect(Collectors.toList());
	l2.forEach(f->System.out.println("Fruit: "+f.getName()+ "color: "+f.getColor()));

	System.out.println("--------------------------------------------------------");

	List<String> l3=list.stream().filter(f->f.getColor()=="red")
						.sorted(Comparator.comparing(Fruit::getPrice))
						.map(Fruit::getName)
						.collect(Collectors.toList());
	l3.forEach(System.out::println);
	
	
	}
	}
