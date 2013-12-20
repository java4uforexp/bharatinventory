package com.java4u.inman.order.bean;

import java.util.Date;
import java.util.Map;

import com.java4u.inman.common.beans.AbstractBean;
import com.java4u.inman.customer.beans.Customer;
import com.java4u.inman.product.beans.Product;

public class Order extends AbstractBean{
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getOrderGenerationDate() {
		return orderGenerationDate;
	}

	public void setOrderGenerationDate(Date orderGenerationDate) {
		this.orderGenerationDate = orderGenerationDate;
	}

	public Map<Product, Integer> getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(Map<Product, Integer> productInfo) {
		this.productInfo = productInfo;
	}

	private Long id;

	
	private String orderId;

	
	private float totalCost;

	
	private Customer customer;

	
	private Date orderGenerationDate;
	
	private Map<Product, Integer> productInfo;
	
	private OrderStatus orderStatus;

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

}
