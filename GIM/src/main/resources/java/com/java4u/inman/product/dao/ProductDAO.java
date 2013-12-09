/**
 * 
 */
package com.java4u.inman.product.dao;

import java.util.List;


import com.java4u.inman.product.entity.ProductEntity;

/**
 * @author Bharath
 *
 */
public interface ProductDAO {
	
	public List<ProductEntity> getProducts();
	public ProductEntity getProductById(Long  productId);
	public ProductEntity getProductByName(String productName);
	public ProductEntity saveProduct(ProductEntity product);
	public ProductEntity updateProduct(ProductEntity product);
	public void deleteProduct(Long productId);

}
