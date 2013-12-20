/**
 * 
 */
package com.java4u.inman.customer.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java4u.inman.common.dao.AbstractDao;
import com.java4u.inman.customer.entity.CustomerEntity;

/**
 * @author Bharath
 *
 */
@Repository("customerDAO")
public class CustomerDAOImpl extends AbstractDao<CustomerEntity> implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public CustomerDAOImpl(){
		
	}
	/* (non-Javadoc)
	 * @see com.java4u.inman.customer.dao.CustomerDAO#getCustomers()
	 */
	public List<CustomerEntity> getCustomers() {
		
		return this.findAll();
	}
	

	/* (non-Javadoc)
	 * @see com.java4u.inman.customer.dao.CustomerDAO#getCustomerById(long)
	 */
	public CustomerEntity getCustomerById(long customerId) {
		
		return this.findById(customerId);
	}

	/* (non-Javadoc)
	 * @see com.java4u.inman.customer.dao.CustomerDAO#getCustomerByName(java.lang.String)
	 */
	public List<CustomerEntity> getCustomerByName(String customerName) {
	
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(CustomerEntity.class);
		criteria.add(Restrictions.or(
				Restrictions.like("firstName",  customerName),
				Restrictions.like("lastName", customerName)));
		List<CustomerEntity> customerEntityList = criteria.list();
		return customerEntityList;
	}

	
	/* (non-Javadoc)
	 * @see com.java4u.inman.customer.dao.CustomerDAO#deleteCustomer(long)
	 */
	public void deleteCustomer(long customerId) {
		this.delete(customerId);

	}
	public CustomerEntity saveCustomer(CustomerEntity customer) {
		
		this.save(customer);
		 return customer;
	}

	public CustomerEntity updateCustomer(CustomerEntity customer) {
		this.update(customer);
		return customer;
	}
	
	public CustomerDAOImpl(Class<CustomerEntity> type) {
		super(type);
	}
}
