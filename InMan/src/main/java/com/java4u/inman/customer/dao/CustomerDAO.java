/**
 * 
 */
package com.java4u.inman.customer.dao;

import java.util.List;


import com.java4u.inman.customer.entity.CustomerEntity;

/**
 * @author Bharath
 *
 */
public interface CustomerDAO {
	
	public List<CustomerEntity> getCustomers();
	public CustomerEntity getCustomerById(long customerId);
	public List<CustomerEntity> getCustomerByName(String customerName);
	public CustomerEntity saveCustomer(CustomerEntity customer);
	public CustomerEntity updateCustomer(CustomerEntity customer);
	public void deleteCustomer(long customerId);
	
	}
