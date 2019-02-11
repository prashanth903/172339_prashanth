package com.app.disrate;

public class DiscountRate {
	public static double serviceDiscountPremium=0.2;
	public static double serviceDiscountGold=0.15;
	public static double serviceDiscountSilver=0.1;
	public static double productDiscountPremium=0.1;
	public static double productDiscountGold=0.1;
	public static double productDiscountSilver=0.1;

public static double getServiceDiscountRate(String memberType) {
	if(memberType.equals("Premium")) {
		return serviceDiscountPremium;
	}
	if(memberType.equals("Gold")) {
		return serviceDiscountGold;
	}
	if(memberType.equals("Silver")) {
		return serviceDiscountSilver;
	}
return 0;
	
}
public static double getProductDiscountRate(String memberType) {
	if(memberType.equals("Premium")) {
		return productDiscountPremium;
	}
	if(memberType.equals("Gold")) {
		return productDiscountGold;
	}
	if(memberType.equals("Silver")) {
		return productDiscountSilver;
	}
	return 0.1;

	
}
}
