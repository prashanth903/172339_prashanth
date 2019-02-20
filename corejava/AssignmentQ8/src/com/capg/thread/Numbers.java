package com.capg.thread;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		Runnable r=()->{list.stream().forEach(System.out::println);};
		new Thread(r).run();
	}

}
