package com.java4u.inman.customer.service;

import java.util.List;

import com.java4u.inman.customer.beans.Customer;
import com.java4u.inman.customer.entity.CustomerEntity;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public Customer getCustomerById(long customerId);
	public List<Customer> getCustomerByName(String customerName);
	public Customer saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(long customerId);

}
