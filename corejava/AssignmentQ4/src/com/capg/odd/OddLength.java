package com.capg.odd;

import java.util.ArrayList;
import java.util.Arrays;

public class OddLength {

	public static void main(String[] args) {
ArrayList<String> al=new ArrayList<String>();
al.add("Mirza");
al.add("sai");
al.add("tiru");
al.add("rishi");

al.removeIf(String->String.length()%2==1);
System.out.println(al);
	
	}

}
