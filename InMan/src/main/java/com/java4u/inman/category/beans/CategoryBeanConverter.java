/**
 * 
 */
package com.java4u.inman.category.beans;

import java.util.ArrayList;
import java.util.List;

import com.java4u.inman.category.entity.CategoryEntity;

/**
 * @author Bharath
 *
 */
public class CategoryBeanConverter {
	
	
	public static CategoryEntity convertBeanToEntity(Category category)
	{
		CategoryEntity categoryEntity = null;
		if(category != null)
		{
		categoryEntity = new CategoryEntity();
		categoryEntity.setId(category.getId());
		categoryEntity.setCategoryDesc(category.getCategoryDesc());
		categoryEntity.setCategoryName(category.getCategoryName());
		categoryEntity.setTax(category.getTax());
		categoryEntity.setCreatedDate(category.getCreatedDate());
		categoryEntity.setUpdatedDate(category.getUpdatedDate());
		categoryEntity.setCreatedBy(category.getCreatedBy());
		categoryEntity.setUpdatedBy(category.getUpdatedBy());
		}
		return categoryEntity;
		
	}

	public static Category convertEntityToBean(CategoryEntity categoryEntity)
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
	
	public static List<Category> convertListBean(List<CategoryEntity> categoryEntityList)
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
	
	public static List<CategoryEntity> convertListEntity(List<Category> categoryList)
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
