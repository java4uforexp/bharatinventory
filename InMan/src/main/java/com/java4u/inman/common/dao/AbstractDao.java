package com.java4u.inman.common.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.java4u.inman.common.entity.AuditableEntity;

/**
 * 
 * @author ajaidka
 *
 */
@Scope("prototype")
public class AbstractDao<T extends AuditableEntity> {
	
	

	private SessionFactory sessionFactory;

	@Autowired
	private void setSessionFactory(SessionFactory factory) {
		this.sessionFactory = factory;
		
	}

	public Session getSession(){
		return sessionFactory.getCurrentSession();		
	}
	
	private final Class<T> type;

	public Class<T> getType() {
		return type;
	}

	public AbstractDao() {
		super();
		this.type = null;
	}
	
	public AbstractDao(Class<T> type) {
		this.type = type;		
	}

	@SuppressWarnings("unchecked")
	public T findById(Long id) {
		
		return (T) getSession().get(type, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getSession().createCriteria(type)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	public void delete(Long id) {
		getSession().delete(findById(id));
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}
	
	public void save(T entity) {
		getSession().saveOrUpdate(entity);
	}

	public void merge(T entity) {
		getSession().merge(entity);
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public void attachToSession(T entity) {
		getSession().lock(entity, LockMode.NONE);
	}
	
	
}
