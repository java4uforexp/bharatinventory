/**
 * 
 */
package com.java4u.inman.customer.beans;

import java.util.ArrayList;
import java.util.List;

import com.java4u.inman.category.beans.Category;
import com.java4u.inman.category.entity.CategoryEntity;
import com.java4u.inman.customer.entity.CustomerEntity;

/**
 * @author Bharath
 *
 */
public class CustomerBeanConvereter {


	public static CustomerEntity convertBeanToEntity(Customer customer)
	{
		CustomerEntity customerEntity = null;
		if(customer != null)
		{
			customerEntity = new CustomerEntity();
			customerEntity.setFirstName(customer.getCustomerFirstName());
			customerEntity.setLastName(customer.getCustomerLastName());
			customerEntity.setAddress(customer.getAddress());
			customerEntity.setPhoneNo(customer.getPhoneNo());
			customerEntity.setStoreName(customer.getStoreName());
			customerEntity.setCreatedDate(customer.getCreatedDate());
			customerEntity.setUpdatedDate(customer.getUpdatedDate());
			customerEntity.setCreatedBy(customer.getCreatedBy());
			customerEntity.setUpdatedBy(customer.getUpdatedBy());
		}
		return customerEntity;
		
	}

	public static Customer convertEntityToBean(CustomerEntity customerEntity)
	{
		Customer customer =null;
		if (customerEntity != null) {
			customer = new Customer();
			customer.setCustomerId(customerEntity.getId());
			customer.setAddress(customerEntity.getAddress());
			customer.setCustomerFirstName(customerEntity.getFirstName());
			customer.setCustomerLastName(customerEntity.getLastName());
			customer.setPhoneNo(customerEntity.getPhoneNo());
			customer.setStoreName(customerEntity.getStoreName());
			customer.setCreatedBy(customerEntity.getCreatedBy());
			customer.setUpdatedBy(customerEntity.getUpdatedBy());
			customer.setCreatedDate(customerEntity.getCreatedDate());
			customer.setUpdatedDate(customerEntity.getUpdatedDate());
		}
		return customer;
		
	}
	
	public static List<Customer> getBeanList(List<CustomerEntity> customerEntityList)
	{
		List<Customer> customerList = null;
		if (customerEntityList != null) {
			customerList = new ArrayList<Customer>();
			Customer customer = null;
			for (CustomerEntity customerEntity : customerEntityList) {
				customer = convertEntityToBean(customerEntity);
				customerList.add(customer);
			}
		}

		return customerList;
	}
	
	public static List<CustomerEntity> getEntityList(List<Customer> customerList)
	{
		List<CustomerEntity> customerEntityList = null;
		if (customerList != null) {
			customerEntityList = new ArrayList<CustomerEntity>();
			CustomerEntity customerEntity = null;
			for (Customer customer : customerList) {
				customerEntity = convertBeanToEntity(customer);
				customerEntityList.add(customerEntity);
			}
		}
		return customerEntityList;
	}
}
