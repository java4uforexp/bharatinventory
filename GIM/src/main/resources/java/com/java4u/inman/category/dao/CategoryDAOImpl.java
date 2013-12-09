package com.java4u.inman.category.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java4u.inman.category.entity.CategoryEntity;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Long saveCategory(CategoryEntity categoryEntity) {
		
		Session session =  sessionFactory.getCurrentSession();
		 session.save(categoryEntity);
		return categoryEntity.getId();
	}

	public CategoryEntity updateCategory(CategoryEntity categoryEntity) {
		Session session =  sessionFactory.openSession();
		 session.update(categoryEntity);
		return categoryEntity;
	}

	public void deleteCategory(CategoryEntity categoryEntity) {
		Session session =  sessionFactory.openSession();
		 session.delete(categoryEntity);
	}

	public CategoryEntity getCategoryEntityById(Long categoryId) {
		Session session =  sessionFactory.openSession();
		CategoryEntity categoryEntity = (CategoryEntity) session.get(CategoryEntity.class,categoryId);
		return categoryEntity;
	}

	public List<CategoryEntity> getCategories() {
		Session session =  sessionFactory.openSession();
		Criteria criteria = session.createCriteria(CategoryEntity.class);
		List<CategoryEntity> categoryList = criteria.list();
		return categoryList;
	}

	public CategoryEntity getCategoryEntityByName(String categoryName) {
		Session session =  sessionFactory.openSession();
		CategoryEntity  categoryEntity = null;
		Criteria criteria = session.createCriteria(CategoryEntity.class);
		criteria.add(Restrictions.eq("categoryName", categoryName));
		 categoryEntity= (CategoryEntity)criteria.uniqueResult();
		return categoryEntity;
		
	}

}
