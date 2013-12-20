package com.java4u.inman.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.java4u.inman.common.entity.AuditableEntity;

@Entity
@Table(name="INMAN_CUSTOMER")
public class CustomerEntity extends AuditableEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq-gen")
	 @SequenceGenerator(name="seq-gen", sequenceName="CUST_SEQ_GEN", initialValue=25, allocationSize=12)
	@Column(name="CUSTOMER_ID")
	private Long id;
	
	@Column(name="CUSTOMER_FIRST_NAME")
	private String firstName;
	
	@Column(name="CUSTOMER_LAST_NAME")
	private String lastName;
	
	@Column(name="CUSTOMER_STORE")
	private String storeName;
	
	@Column(name="CUSTOMER_ADDRESS")
	private String address;
	
	@Column(name="CUSTOMER_PHONE")
	private String phoneNo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	

}
