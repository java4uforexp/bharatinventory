/**
 * 
 */
package com.java4u.inman.product.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java4u.inman.common.dao.AbstractDao;
import com.java4u.inman.product.entity.ProductEntity;

/**
 * @author Bharath
 *
 */
@Repository("productDAO")
public class ProductDAOImpl extends AbstractDao<ProductEntity> implements ProductDAO {

	public ProductDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDAOImpl(Class<ProductEntity> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<ProductEntity> getProducts() {
		
		return this.findAll();
	}

	public ProductEntity getProductById(Long productId) {
		// TODO Auto-generated method stub
		return this.findById(productId);
	}

	public ProductEntity getProductByName(String productName) {
		Criteria criteria = getSession().createCriteria(ProductEntity.class);
		criteria.add(Restrictions.like("productName", productName));
		ProductEntity productEntity = (ProductEntity) criteria.uniqueResult();
		return productEntity;
	}

	public ProductEntity saveProduct(ProductEntity product) {
		
		this.save(product);
		return product ;
	}

	public ProductEntity updateProduct(ProductEntity product) {

		this.update(product);
		return product;
	}

	public void deleteProduct(Long productId) {
		this.delete(productId);
		
	}
	
}
