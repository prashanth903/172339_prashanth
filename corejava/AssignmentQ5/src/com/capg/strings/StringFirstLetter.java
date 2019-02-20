package com.capg.strings;

import java.util.ArrayList;

public class StringFirstLetter {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mirza");
		al.add("sai");
		al.add("tiru");
		al.add("rishi");
	
		String result = al.stream().map(s -> Character.toString(s.charAt(0))).reduce(" ", (a, b) -> a + b);
System.out.println(result);
	}

}
