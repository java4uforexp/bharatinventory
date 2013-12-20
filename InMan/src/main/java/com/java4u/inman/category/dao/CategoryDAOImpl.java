package com.java4u.inman.category.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java4u.inman.category.entity.CategoryEntity;
import com.java4u.inman.common.dao.AbstractDao;

@Repository("categoryDAO")
public class CategoryDAOImpl extends AbstractDao<CategoryEntity> implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Long saveCategory(CategoryEntity categoryEntity) {
		
		Session session =  getSession();
		 session.save(categoryEntity);
		return categoryEntity.getId();
	}

	public CategoryEntity updateCategory(CategoryEntity categoryEntity) {
		Session session =  getSession();
		 session.update(categoryEntity);
		return categoryEntity;
	}

	public void deleteCategory(CategoryEntity categoryEntity) {
		Session session =  getSession();
		 session.delete(categoryEntity);
	}

	public CategoryEntity getCategoryEntityById(Long categoryId) {
		Session session =  getSession();
		CategoryEntity categoryEntity = (CategoryEntity) session.get(CategoryEntity.class,categoryId);
		return categoryEntity;
	}

	public List<CategoryEntity> getCategories() {
		Session session = getSession();
		Criteria criteria = session.createCriteria(CategoryEntity.class);
		List<CategoryEntity> categoryList = criteria.list();
		return categoryList;
	}

	public CategoryEntity getCategoryEntityByName(String categoryName) {
		Session session = getSession();
		CategoryEntity  categoryEntity = null;
		Criteria criteria = session.createCriteria(CategoryEntity.class);
		criteria.add(Restrictions.eq("categoryName", categoryName));
		 categoryEntity= (CategoryEntity)criteria.uniqueResult();
		return categoryEntity;
		
	}

	public List<CategoryEntity> getPaginatedCategory(Integer pageNo, Integer noOfItems) {
		Session session = getSession();
		List<CategoryEntity>  categoryEntityList = null;
		Criteria criteria = session.createCriteria(CategoryEntity.class);
		criteria.setFirstResult(pageNo);
		criteria.setMaxResults(noOfItems);
		categoryEntityList = criteria.list();
		return categoryEntityList;
	}

	public Integer getCategorySize() {
		Integer size = 0;
		Session session = getSession();
		List<CategoryEntity>  categoryEntityList = null;
		Criteria criteria = session.createCriteria(CategoryEntity.class);
		size = ((Long)criteria.setProjection(Projections.rowCount()).uniqueResult()).intValue();
		return size;
	}

}
