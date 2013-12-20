/**
 * 
 */
package com.java4u.inman.category.beans;

import java.util.Date;
import java.util.List;

import com.java4u.inman.common.beans.AbstractBean;

/**
 * @author Bharath
 *
 */
public class Category extends AbstractBean {

	private Long id;

	private String categoryName;
	 
	private String categoryDesc;
	
	private float tax;
	
	private List<Category> categoryList;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}
}
