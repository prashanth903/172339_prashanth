package com.capg.funtionalinterface;

public class LambdaExpression {

	public static void main(String[] args) {
		Arthmeticops a=(x,y)->{System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		};
	a.operations(10, 8);
	}

}
