/**
 * 
 */
package com.java4u.inman.product.beans;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.java4u.inman.category.beans.Category;
import com.java4u.inman.category.entity.CategoryEntity;
import com.java4u.inman.product.entity.ProductEntity;

/**
 * @author Bharath
 * 
 */
public class ProductBeanConverter {

	public static ProductEntity convertBeanToEntity(Product product) {
		ProductEntity productEntity = null;
		if (product != null) {
			productEntity = new ProductEntity();
			productEntity.setManfacture(product.getManfacture());
			productEntity.setCreatedBy(product.getCreatedBy());
			productEntity.setCreatedDate(product.getCreatedDate());
			productEntity.setUpdatedBy(product.getUpdatedBy());
			productEntity.setUpdatedDate(product.getUpdatedDate());
			productEntity.setPrice(product.getPrice());
			productEntity.setProductName(product.getProductName());
			CategoryEntity categoryEntity = new CategoryEntity();
			categoryEntity.setId(product.getCategory().getId());
			productEntity.setCategoryEntity(categoryEntity);
		}
		return productEntity;
	}

	public static Product convertEntityToBean(ProductEntity productEntity) {
		Product product = null;
		if (productEntity != null) {
			product = new Product();
			product.setManfacture(productEntity.getManfacture());
			product.setCreatedBy(productEntity.getCreatedBy());
			product.setCreatedDate(productEntity.getCreatedDate());
			product.setUpdatedBy(productEntity.getUpdatedBy());
			product.setUpdatedDate(productEntity.getUpdatedDate());
			product.setPrice(productEntity.getPrice());
			product.setProductName(productEntity.getProductName());
			Category category = new Category();
			category.setId(productEntity.getCategoryEntity().getId());
			category.setCategoryName(productEntity.getCategoryEntity()
					.getCategoryName());
			category.setTax(productEntity.getCategoryEntity().getTax());
			product.setCategory(category);
		}
		return product;
	}

	public static List<ProductEntity> getEntityList(List<Product> productList){
		List<ProductEntity> productEntityList = null;
				if(productList != null)
				{
					productEntityList = new ArrayList<ProductEntity>();
					ProductEntity productEntity = null;
					for (Product product : productList) {
						productEntity = convertBeanToEntity(product);
						productEntityList.add(productEntity);
					}
				}
				return productEntityList;
	}
	
	public static List<Product> getBeanList(List<ProductEntity> productEntityList){
		List<Product> productList = null;
		if (productEntityList != null) {
			productList = new ArrayList<Product>();
			Product product = null;
			for (ProductEntity productEntity : productEntityList) {
				product = convertEntityToBean(productEntity);
				productList.add(product);
			}
		}
		return productList;
	}
	
	
}
