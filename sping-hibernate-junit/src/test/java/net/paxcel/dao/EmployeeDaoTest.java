package net.paxcel.dao;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import junit.framework.Assert;
import net.paxcel.dao.impl.EmployeeDaoImpl;
import net.paxcel.hibernate.pojos.Address;
import net.paxcel.hibernate.pojos.Employee;
import org.junit.Test;


public class EmployeeDaoTest extends BaseTest{

	@Resource
	private EmployeeDaoImpl employeeDao;
	
	@Test
	public void testFindAll(){
		Assert.assertFalse(employeeDao.findAll().isEmpty());		
	}
	
	@Test
	public void testFindById(){
		Assert.assertNotNull(employeeDao.getEmployeeByName("Badal"));		
	}
	
	
	@Test
	public void testSaveEmployee(){
		Employee employee = new Employee();
		employee.setName("Flash gordan");
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(new Address(employee));
		
		employee.setAddresses(addresses);
		employeeDao.save(employee);
		
		Assert.assertNotNull(employeeDao.findById(employee.getId()));
		Assert.assertTrue(employeeDao.findById(employee.getId()).getAddresses().size() > 0);
	}
	
	
	@Test
	public void testEmployeeDelete(){
		Employee employee = employeeDao.getEmployeeByName("Badal");
		long id = employee.getId();
		employeeDao.delete(id);
		Assert.assertNull(employeeDao.findById(id));
	}
	
}
