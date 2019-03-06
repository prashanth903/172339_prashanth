package com.capg.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.DAO.EmpDaoImpl;
import com.capg.pojo.Employee;

public class EmpServicesImpl implements EmpServices {

	
	ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
	 EmpDaoImpl ed=(EmpDaoImpl)ac.getBean("edao");
	@Override
	public boolean addEmp(Employee e) {
		
		ed.insert(e);
		return true;
	}

	@Override
	public List<Employee> getEmp(Employee e) {
		return ed.employee(e);
		
	}

	@Override
	public boolean updateEmpSal(Employee e) {
	  ed.update(e);
		return true;
	}
	
	@Override
	public List<Employee> orderBy(Employee e) {
		
		return ed.employee(e);
	}

	@Override
	public List<Employee> groupBy(Employee e) {
		
		return ed.employee(e);
	}

	@Override
	public boolean getMaxSal(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getWithoutComm(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}	
	
}
