/**
 * 
 */
package com.java4u.inman.category.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.java4u.inman.category.entity.CategoryEntity;

/**
 * @author Bharath
 *
 */

public interface CategoryDAO {

	public Long saveCategory(CategoryEntity categoryEntity);
	
	public CategoryEntity updateCategory(CategoryEntity categoryEntity);
	
	public void deleteCategory(CategoryEntity categoryEntity);
	
	public CategoryEntity getCategoryEntityById(Long categoryId);
	
	public CategoryEntity getCategoryEntityByName(String categoryName);
	
	public List<CategoryEntity> getCategories();
	
	
}
