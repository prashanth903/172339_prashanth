package com.capg.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.capg.pojo.Employee;

public interface EmpDAO {

	public List<Employee> getAll();
	public boolean insert(Employee e);
	public boolean delete(Employee e);
	public boolean update(Employee e);
	public List<Employee> groupBy();
	public List<Employee> orderBy();
	
}
