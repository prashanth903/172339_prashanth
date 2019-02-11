package com.cust;

public class Customer {
public String name;
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
private boolean member=false;
public String memberType;
public Customer() {
	super();
}
public void setMember(boolean member) {
	this.member = member;
}
public void setMemberType(String memberType) {
	this.memberType = memberType;
}
public boolean isMember() {
	return member;
}
public String getMemberType() {
	
	return memberType;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
}
public void customer(String name) {
	this.name=name;
}

}
