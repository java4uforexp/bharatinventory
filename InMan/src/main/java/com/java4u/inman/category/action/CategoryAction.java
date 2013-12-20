package com.java4u.inman.category.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java4u.inman.category.beans.Category;
import com.java4u.inman.category.service.CategoryService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CategoryAction extends ActionSupport implements ModelDriven<Category>{
	
	private Category category = new Category();
	
	@Autowired
	private CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public String saveOrupdate() {
		if (category.getId() != null) {
			categoryService.updateCategory(category);
		} else {
			categoryService.saveCategory(category);
		}
		return "success";
	}

	public String getCategories()
	{
		Integer  pageNo = 1;
		if((category.getPageNo()!= null ) && (category.getPageNo() >0))
		{
			pageNo = category.getPageNo();
		}
		Integer recordsPerPage = 2;
		Integer firstIndex = (recordsPerPage-1)*pageNo;
		List<Category> categoryList = categoryService.getPaginatedCategory(firstIndex, recordsPerPage);
		category.setCategoryList(categoryList);
		Integer totalCount = categoryService.getCategorySize();
		Integer  noOfPages = (int) Math.ceil(totalCount * 1.0 / recordsPerPage);
		category.setNoOfPages(noOfPages);
		category.setPageNo(pageNo);
		return "success";
	}
	
	
	public String viewCategory()
	{
		Long categoryId = category.getId();
		Category newCategory = categoryService.getCategory(categoryId);
		category = newCategory;
		return "success";
	}
	public Category getModel() {
		
		return category;
	}
	
	

}
