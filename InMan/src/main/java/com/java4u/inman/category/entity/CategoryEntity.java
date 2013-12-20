package com.java4u.inman.category.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.java4u.inman.common.entity.AuditableEntity;


@Entity
@Table(name="INMAN_CATEGORY")
public class CategoryEntity extends AuditableEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq-gen")
	 @SequenceGenerator(name="seq-gen", sequenceName="CATEGORY_SEQ_GEN", initialValue=25, allocationSize=12)
	@Column(name="CATEGORY_ID")
	private Long id;
	
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	
	@Column(name="CATEGORY_DESC")
	private String categoryDesc;
	
	@Column(name="CATEGORY_TAX")
	private float tax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}
	
}
