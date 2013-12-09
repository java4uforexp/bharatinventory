package com.java4u.inman.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.java4u.inman.category.beans.Category;
import com.java4u.inman.category.beans.CategoryBeanConverter;
import com.java4u.inman.category.dao.CategoryDAO;
import com.java4u.inman.category.entity.CategoryEntity;

@Service("categoryService")
@Transactional(propagation=Propagation.REQUIRED)
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;
	
	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	public Category saveCategory(Category category) {
		CategoryEntity categoryEntity = CategoryBeanConverter.convertBeanToEntity(category);
		categoryDAO.saveCategory(categoryEntity);
		category.setId(categoryEntity.getId());
		return category;
	}

	public Category updateCategory(Category category) {
		CategoryEntity categoryEntity = CategoryBeanConverter.convertBeanToEntity(category);
		categoryDAO.updateCategory(categoryEntity);
		Category updatedCategory = CategoryBeanConverter.convertEntityToBean(categoryEntity);
		return updatedCategory;
	}

	public void deleteCategory(Long categoryId) {
		CategoryEntity categoryEntity = categoryDAO.getCategoryEntityById(categoryId);
		categoryDAO.deleteCategory(categoryEntity);

	}

	public Category getCategory(Long categoryId) {
		CategoryEntity categoryEntity = categoryDAO.getCategoryEntityById(categoryId);
		return CategoryBeanConverter.convertEntityToBean(categoryEntity);
	}

	public List<Category> getCategories() {
		List<CategoryEntity> categoryEntityList = categoryDAO.getCategories();
		List<Category> categoryList = CategoryBeanConverter.convertListBean(categoryEntityList);
		return categoryList;
	}

	public Category getCategoryByName(String categoryName) {
	CategoryEntity categoryEntity = categoryDAO.getCategoryEntityByName(categoryName);
		return CategoryBeanConverter.convertEntityToBean(categoryEntity);
	}

}
