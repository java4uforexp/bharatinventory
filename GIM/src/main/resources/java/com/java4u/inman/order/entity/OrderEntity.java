package com.java4u.inman.order.entity;

import java.util.Date;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKey;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.java4u.inman.common.entity.AuditableEntity;
import com.java4u.inman.customer.entity.CustomerEntity;
import com.java4u.inman.product.entity.ProductEntity;

@Entity
@Table(name="INMAN_ORDER_DETAILS")
public class OrderEntity extends AuditableEntity {

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq-gen")
@SequenceGenerator(name="seq-gen", sequenceName="ORDER_SEQ_GEN", initialValue=25, allocationSize=12)
@Column(name="ORDER_GEN_ID")
private Long id;

@Column(name="ORDER_ID")
private String orderId;

@Column(name="TOTAL_COST")
private float totalCost;

@OneToOne
@JoinColumn(name="CUSTOMER_ID")
private CustomerEntity customerEntity;

@Column(name="ORDER_DATE")
@Temporal(TemporalType.TIMESTAMP)
private Date orderGenerationDate;

@ElementCollection
@CollectionTable(
    name="INMAN_PRODUCT_QUANTITY",
    joinColumns={@JoinColumn(name="PQ_ID")}
)
@Column(name="QUANTITY")
@MapKeyJoinColumn(name="PRODUCT_ID")
private Map<ProductEntity, Integer> productInfo;

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
public CustomerEntity getCustomerEntity() {
	return customerEntity;
}
public void setCustomerEntity(CustomerEntity customerEntity) {
	this.customerEntity = customerEntity;
}
public Date getOrderGenerationDate() {
	return orderGenerationDate;
}
public void setOrderGenerationDate(Date orderGenerationDate) {
	this.orderGenerationDate = orderGenerationDate;
}
public Map<ProductEntity, Integer> getProductInfo() {
	return productInfo;
}
public void setProductInfo(Map<ProductEntity, Integer> productInfo) {
	this.productInfo = productInfo;
}
	
}
