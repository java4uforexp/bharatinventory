/**
 * 
 */
package com.java4u.inman.category;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.java4u.inman.category.beans.Category;
import com.java4u.inman.category.service.CategoryService;

/**
 * @author Bharath
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })

public class CategoryServiceImplUTest {

	/**
	 * Test method for {@link com.java4u.inman.category.service.CategoryServiceImpl#setCategoryDAO(com.java4u.inman.category.dao.CategoryDAO)}.
	 */
	@Autowired
	private CategoryService categoryService;

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	/**
	 * Test method for {@link com.java4u.inman.category.service.CategoryServiceImpl#saveCategory(com.java4u.inman.category.beans.Category)}.
	 */
	@Test
	public void testSaveCategory() {
		Category category = new Category();
		category.setCategoryName("Test2");
		category.setCategoryDesc("TestDesc11");
		category.setTax(22.5f);
		category.setCreatedBy("bharath");
		category.setCreatedDate(new Date());
		
		Category newCategory = categoryService.saveCategory(category);
		assertNotNull(newCategory);
		assertTrue(newCategory.getId()>0);
		
		Category getCategory = categoryService.getCategory(newCategory.getId());
	
		assertEquals("", category.getCategoryName(), getCategory.getCategoryName());
		
		
	}

	/**
	 * Test method for {@link com.java4u.inman.category.service.CategoryServiceImpl#updateCategory(com.java4u.inman.category.beans.Category)}.
	 */
	@Test
	public void testUpdateCategory() {
	Category oldCategory = categoryService.getCategory(528l);
	oldCategory.setCategoryDesc("UpdatedDesc");
	oldCategory.setCategoryName("updatedName");
//	Category updatedCategory = categoryService.
	}

	/**
	 * Test method for {@link com.java4u.inman.category.service.CategoryServiceImpl#deleteCategory(java.lang.Long)}.
	 */
	@Test
	public void testDeleteCategory() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.java4u.inman.category.service.CategoryServiceImpl#getCategory(java.lang.Long)}.
	 */
	@Test
	public void testGetCategory() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.java4u.inman.category.service.CategoryServiceImpl#getCategories()}.
	 */
	@Test
	public void testGetCategories() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.java4u.inman.category.service.CategoryServiceImpl#getCategoryByName(java.lang.String)}.
	 */
	@Test
	public void testGetCategoryByName() {
		fail("Not yet implemented");
	}

}
