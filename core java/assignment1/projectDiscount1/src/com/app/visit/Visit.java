package com.app.visit;

import java.util.Date;

import com.app.disrate.DiscountRate;
import com.cust.Customer;

public class Visit {
public Customer customer;
public Date date;
public double serviceExpense;
public double productExpense;

public Visit() {
	super();
}
public double getServiceExpense() {
	return serviceExpense;
}
public void setServiceExpense(double serviceExpense) {
	this.serviceExpense = serviceExpense;
}
public double getProductExpense() {
	return productExpense;
}
public void setProductExpense(double productExpense) {
	this.productExpense = productExpense;
}
public void visit(Customer name,Date date2) {
	this.customer=name;
	this.date=date2;
}
@Override
public String toString() {
	return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense="
			+ productExpense + ", name=" + customer.name + "]";
}
public double getTotalExpense() {
	
	return (serviceExpense-DiscountRate.getServiceDiscountRate("gold"))+(productExpense-DiscountRate.getProductDiscountRate("gold"));
}
}
