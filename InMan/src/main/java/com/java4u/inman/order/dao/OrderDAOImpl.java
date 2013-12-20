/**
 * 
 */
package com.java4u.inman.order.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java4u.inman.common.dao.AbstractDao;
import com.java4u.inman.order.bean.OrderStatus;
import com.java4u.inman.order.entity.OrderEntity;

/**
 * @author Bharath
 *
 */
@Repository("orderDAO")
public class OrderDAOImpl extends AbstractDao<OrderEntity>implements OrderDAO {

	
	public OrderDAOImpl() {
		super();
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

	/* (non-Javadoc)
	 * @see com.java4u.inman.order.dao.OrderDAO#getOrdersByCustomerName(java.lang.String)
	 */
	public List<OrderEntity> getOrdersByCustomer(Long customerId) {
		
		Criteria criteria = getSession().createCriteria(OrderEntity.class);
		criteria.createAlias("customerEntity", "customer");
		criteria.add(Restrictions.eq("customer.id", customerId));
		List<OrderEntity> orderEntityList = criteria.list();
		return orderEntityList;
		
	}

	/* (non-Javadoc)
	 * @see com.java4u.inman.order.dao.OrderDAO#getOrderById(long)
	 */
	public OrderEntity getOrderById(long orderId) {
		
		return this.findById(orderId);
	}

	/* (non-Javadoc)
	 * @see com.java4u.inman.order.dao.OrderDAO#getOrderByName(java.lang.String)
	 */
	public OrderEntity getOrderByName(String orderName) {
		Criteria criteria = getSession().createCriteria(OrderEntity.class);
		criteria.add(Restrictions.eq("orderId", orderName));
		OrderEntity  orderEntity = (OrderEntity)criteria.uniqueResult();
		return orderEntity;
	}

	/* (non-Javadoc)
	 * @see com.java4u.inman.order.dao.OrderDAO#getOrderByDate(java.util.Date, java.util.Date)
	 */
	public List<OrderEntity> getOrderByDate(Date fromDate, Date toDate) {
	
		Criteria criteria = getSession().createCriteria(OrderEntity.class);
		criteria.add(Restrictions.between("orderGenerationDate", fromDate, toDate));
		List<OrderEntity> orderEntityList = criteria.list();
		return orderEntityList;
		
	}

	
	/* (non-Javadoc)
	 * @see com.java4u.inman.order.dao.OrderDAO#deleteOrder(long)
	 */
	public void deleteOrder(long orderId) {
		this.delete(orderId);

	}

	public OrderEntity saveOrder(OrderEntity order) {
		this.save(order);
		return order ;
	}

	public OrderEntity updateOrder(OrderEntity order) {
		this.update(order);
		return order;
	}
	
	
	public OrderDAOImpl(Class<OrderEntity> type) {
		super(type);
		
	}

	public List<OrderEntity> getOrderStatus(OrderStatus orderStaus, String user) {
		List<OrderEntity> orderEntityList = null;
		Criteria criteria = getSession().createCriteria(OrderEntity.class);
		criteria.add(Restrictions.eq("orderStatus", orderStaus));
		criteria.add(Restrictions.eq("createdBy", user));
		orderEntityList = criteria.list();
		return orderEntityList;
	}

}
