/**
 * 
 */
package com.java4u.inman.product.service;

import java.util.List;

import com.java4u.inman.customer.beans.Customer;
import com.java4u.inman.product.beans.Product;

/**
 * @author Bharath
 *
 */
public interface ProductService {
	
	public List<Product> getProducts();
	public Product getProductById(Long productId);
	public Product getProductByName(String productName);
	public Product saveProduct(Product product);
	public Product updateProduct(Product product);
	public void deleteProduct(Long productId);

}
