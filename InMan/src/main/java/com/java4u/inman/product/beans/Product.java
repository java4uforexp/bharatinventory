package com.java4u.inman.product.beans;

import com.java4u.inman.category.beans.Category;
import com.java4u.inman.common.beans.AbstractBean;

public class Product extends AbstractBean{
	
	private Long id;
	
	private String productName;
	
	private String manfacture;
		
	private  float price;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getManfacture() {
		return manfacture;
	}

	public void setManfacture(String manfacture) {
		this.manfacture = manfacture;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	private Category category;

}
