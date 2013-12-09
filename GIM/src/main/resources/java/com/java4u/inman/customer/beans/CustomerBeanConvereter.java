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
			customerEntity.setId(category.getId());
			customerEntity.setCategoryDesc(category.getCategoryDesc());
			customerEntity.setCategoryName(category.getCategoryName());
			customerEntity.setTax(category.getTax());
			customerEntity.setCreatedDate(category.getCreatedDate());
			customerEntity.setUpdatedDate(category.getUpdatedDate());
			customerEntity.setCreatedBy(category.getCreatedBy());
			customerEntity.setUpdatedBy(category.getUpdatedBy());
		}
		return categoryEntity;
		
	}

	public static Customer convertEntityToBean(CustomerEntity customerEntity)
	{
		Category category =null;
		if (categoryEntity != null) {
			category = new Category();
			category.setId(categoryEntity.getId());
			category.setCategoryDesc(categoryEntity.getCategoryDesc());
			category.setCategoryName(categoryEntity.getCategoryName());
			category.setTax(categoryEntity.getTax());
			category.setCreatedDate(categoryEntity.getCreatedDate());
			category.setUpdatedDate(categoryEntity.getUpdatedDate());
			category.setCreatedBy(categoryEntity.getCreatedBy());
			category.setUpdatedBy(categoryEntity.getUpdatedBy());
		}
		return category;
		
	}
	
	public static List<Customer> convertListBean(List<CustomerEntity> customerEntityList)
	{
		List<Category> categoryList = null;
		if (categoryEntityList != null) {
			categoryList = new ArrayList<Category>();
			Category category = null;
			for (CategoryEntity categoryEntity : categoryEntityList) {
				category = convertEntityToBean(categoryEntity);
				categoryList.add(category);
			}
		}

		return categoryList;
	}
	
	public static List<CustomerEntity> convertListEntity(List<Customer> customerList)
	{
		List<CategoryEntity> categoryEntityList = null;
		if (categoryList != null) {
			categoryEntityList = new ArrayList<CategoryEntity>();
			CategoryEntity categoryEntity = null;
			for (Category category : categoryList) {
				categoryEntity = convertBeanToEntity(category);
				categoryEntityList.add(categoryEntity);
			}
		}
		return categoryEntityList;
	}
}
