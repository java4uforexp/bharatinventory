/**
 * 
 */
package com.java4u.inman.order.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java4u.inman.order.bean.Order;
import com.java4u.inman.order.dao.OrderDAO;
import com.java4u.inman.order.entity.OrderEntity;

/**
 * @author Bharath
 *
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;
	

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}


	public List<Order> getOrdersByCustomer(Long customerId) {
		// TODO Bean Converter
		List<OrderEntity> orderEntity = orderDAO.getOrdersByCustomer(customerId);
		List<Order> orderList =null;
		return orderList;
	}


	public Order getOrderById(long orderId) {
		// TODO BeanConverter
		OrderEntity orderEntity = orderDAO.getOrderById(orderId);
		Order order =null;
		return order;
	}


	public Order getOrderByName(String orderName) {
		// TODO BeanConverter
				OrderEntity orderEntity = orderDAO.getOrderByName(orderName);
				Order order =null;
				return order;
	}


	public List<Order> getOrderByDate(Date fromDate, Date toDate) {
		// TODO Bean Converter
		List<OrderEntity> orderEntity = orderDAO.getOrderByDate(fromDate, toDate);
		List<Order> orderList =null;
		return orderList;
	}


	public Order saveOrder(Order order) {
		// TODO Bean Converter
		OrderEntity orderEntity = null;
		orderDAO.saveOrder(orderEntity);
		order.setId(orderEntity.getId());
		return order;
	}


	public Order updateOrder(Order order) {
		// TODO Bean Converter
		OrderEntity orderEntity = null;
		orderDAO.updateOrder(orderEntity);
		return order;
	}


	public void deleteOrder(long orderId) {
		orderDAO.deleteOrder(orderId);
		
	}

}
