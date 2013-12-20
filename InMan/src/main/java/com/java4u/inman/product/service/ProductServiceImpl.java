/**
 * 
 */
package com.java4u.inman.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java4u.inman.product.beans.Product;
import com.java4u.inman.product.beans.ProductBeanConverter;
import com.java4u.inman.product.dao.ProductDAO;
import com.java4u.inman.product.entity.ProductEntity;

/**
 * @author Bharath
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public List<Product> getProducts() {
		List<ProductEntity> productEntityList = productDAO.getProducts();
		List<Product> productList = ProductBeanConverter.getBeanList(productEntityList);
		return productList;
	}

	public Product getProductById(Long productId) {
		// TODO Bean Converter
		ProductEntity productEntity = productDAO.getProductById(productId);
		Product product = ProductBeanConverter.convertEntityToBean(productEntity);
		return product;
	}

	public Product getProductByName(String productName) {
		ProductEntity productEntity = productDAO.getProductByName(productName);
		Product product = ProductBeanConverter.convertEntityToBean(productEntity);
		return product;
	}

	public Product saveProduct(Product product) {
	ProductEntity productEntity = ProductBeanConverter.convertBeanToEntity(product);
	productDAO.saveProduct(productEntity);
	product.setId(productEntity.getId());
		return product;
	}

	public Product updateProduct(Product product) {
		ProductEntity productEntity = ProductBeanConverter.convertBeanToEntity(product);
		productDAO.updateProduct(productEntity);
		return product;
	}

	public void deleteProduct(Long productId) {
		productDAO.deleteProduct(productId);
		
	}

	
}
