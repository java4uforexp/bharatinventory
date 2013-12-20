/**
 * 
 */
package com.java4u.inman.order.dao;

import java.util.Date;
import java.util.List;

import com.java4u.inman.order.bean.Order;
import com.java4u.inman.order.bean.OrderStatus;
import com.java4u.inman.order.entity.OrderEntity;

/**
 * @author Bharath
 *
 */
public interface OrderDAO {

	public List<OrderEntity> getOrdersByCustomer(Long customerId);
	public OrderEntity getOrderById(long orderId);
	public OrderEntity getOrderByName(String orderName);
	public List<OrderEntity> getOrderByDate(Date fromDate , Date toDate);
	public OrderEntity saveOrder(OrderEntity order);
	public void deleteOrder(long orderId);
	public OrderEntity updateOrder(OrderEntity order);
	
	public List<OrderEntity> getOrderStatus(OrderStatus orderStaus, String user);
}
