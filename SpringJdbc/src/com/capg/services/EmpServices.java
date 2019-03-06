package com.capg.services;

import java.util.List;

import com.capg.pojo.Employee;

public interface EmpServices {

	public boolean addEmp(Employee e);

	List<Employee> getEmp(Employee e);

	boolean updateEmpSal(Employee e);
	
	List<Employee> orderBy(Employee e);
	
	List<Employee> groupBy(Employee e);
	
	public boolean getMaxSal(Employee e);
	
	public boolean getWithoutComm(Employee e);
	
}
