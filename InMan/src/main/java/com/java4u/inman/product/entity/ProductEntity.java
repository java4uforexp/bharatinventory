package com.java4u.inman.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.java4u.inman.category.entity.CategoryEntity;
import com.java4u.inman.common.entity.AuditableEntity;
import com.java4u.inman.order.bean.OrderStatus;

@Entity
@Table(name="INMAN_PRODUCT")
public class ProductEntity extends AuditableEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq-gen")
	 @SequenceGenerator(name="seq-gen", sequenceName="PRODUCT_SEQ_GEN", initialValue=25, allocationSize=12)
	@Column(name="PRODUCT_ID")
	private Long id;
	
	@Column(name="PRODUCT_NAME",unique=true)
	private String productName;
	
	@Column(name="PRODUCT_MAN_INFO")
	private String manfacture;
	
	@Column(name="PRODUCT_PRICE")
	private  float price;
	
	@OneToOne
	@JoinColumn(name="CATEGORY_ID")
	private CategoryEntity categoryEntity;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CategoryEntity getCategoryEntity() {
		return categoryEntity;
	}

	public void setCategoryEntity(CategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getManfacture() {
		return manfacture;
	}

	public void setManfacture(String manfacture) {
		this.manfacture = manfacture;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
}
