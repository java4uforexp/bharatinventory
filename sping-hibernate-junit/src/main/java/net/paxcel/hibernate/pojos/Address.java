package net.paxcel.hibernate.pojos;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address extends AbstractEntity{ 

	@Basic
	private String addressLine1;

	@Basic
	private Long employeeId;
	
	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private Employee employee;
	
	public Address(){}
	
	public Address(Employee employee) {
		this.employee = employee; 
		addressLine1 = "addressline1";
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	

}
