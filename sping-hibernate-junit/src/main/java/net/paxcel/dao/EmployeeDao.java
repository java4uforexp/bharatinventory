package net.paxcel.dao;

import org.springframework.transaction.annotation.Transactional;

import net.paxcel.hibernate.pojos.Employee;

public interface EmployeeDao {
	public Employee getEmployeeByName(String name);
	public void save(Employee employee);		
}
