/**
 * 
 */
package com.java4u.inman.order.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.java4u.inman.order.bean.Order;
import com.java4u.inman.order.service.OrderService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author Bharath
 *
 */
public class OrderAction extends ActionSupport implements ModelDriven<Order>{
	private Order order = new Order();
	
	@Autowired
	private OrderService orderService;
	
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public Order getModel() {
		// TODO Auto-generated method stub
		return this.order;
	}
	
	public String execute()
	{
		return "success";
	}
	
	

}
