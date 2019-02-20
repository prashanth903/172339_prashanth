package com.capg.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.capg.streams.News;

public class TestNews {

	public static void main(String[] args) {
		List<News> list2=new ArrayList<>();
		list2.add(new News(777,"sai","mirza","u r good"));
		list2.add(new News(888,"rishi","sports","the budget for sports is 10lacs"));
		list2.add(new News(888,"rishi","news","read news"));
		list2.add(new News(999,"onkar","sports","By playing our body will be relaxed"));
		list2.add(new News(000,"seshu","Budget","the budget is 20lacs"));

		//Assignment Q4
		Map<Object, Long> ls1=list2.stream().collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()));
					long maxval=(Collections.max(ls1.values()));
					for(Entry<Object, Long> entry:ls1.entrySet()) {
				if(entry.getValue()==maxval) {
					System.out.println(entry.getKey());
	}
	//Assignment Q5
		List<News> ls=list2.stream().filter(n->n.getComment().contains("budget")).collect(Collectors.toList());
		long l=ls.stream().count();
		System.out.println("The word budget in comments is "+l+" times repeated");
	
	}	
	//Assignment Q6
					Map<Object, Long> ls2=list2.stream().collect(Collectors.groupingBy(News::getPostedByUser,Collectors.counting()));
					long maxval1=(Collections.max(ls2.values()));
					for(java.util.Map.Entry<Object, Long> entry1:ls2.entrySet()) {
				if(entry1.getValue()==maxval1) {
					System.out.println(entry1.getKey());
	}
				//Assignment Q7
				Map<Object, Long> ls3=list2.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
				System.out.println(ls3);
				}
}
}