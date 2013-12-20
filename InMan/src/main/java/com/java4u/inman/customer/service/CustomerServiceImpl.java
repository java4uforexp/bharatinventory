/**
 * 
 */
package com.java4u.inman.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java4u.inman.customer.beans.Customer;
import com.java4u.inman.customer.beans.CustomerBeanConvereter;
import com.java4u.inman.customer.dao.CustomerDAO;
import com.java4u.inman.customer.entity.CustomerEntity;

/**
 * @author Bharath
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}


	public List<Customer> getCustomers() {
	List<CustomerEntity> customerEntity = customerDAO.getCustomers();
	List<Customer> customerList = CustomerBeanConvereter.getBeanList(customerEntity);
	return customerList;
	}


	public Customer getCustomerById(long customerId) {
		CustomerEntity customerEntity = customerDAO.getCustomerById(customerId);
		Customer customer = CustomerBeanConvereter.convertEntityToBean(customerEntity);
		return customer;
	}


	public List<Customer> getCustomerByName(String customerName) {
		List<CustomerEntity> customerEntity = customerDAO.getCustomerByName(customerName);
		List<Customer> customerList = CustomerBeanConvereter.getBeanList(customerEntity);
		return customerList;
	}


	public Customer saveCustomer(Customer customer) {
		CustomerEntity customerEntity = CustomerBeanConvereter.convertBeanToEntity(customer);
		customerDAO.saveCustomer(customerEntity);
		customer.setCustomerId(customerEntity.getId());
		return customer;
	}


	public Customer updateCustomer(Customer customer) {
		CustomerEntity customerEntity = CustomerBeanConvereter.convertBeanToEntity(customer);
		customerDAO.updateCustomer(customerEntity);
		return customer;
	}


	public void deleteCustomer(long customerId) {
	customerDAO.deleteCustomer(customerId);
	}

	

}
