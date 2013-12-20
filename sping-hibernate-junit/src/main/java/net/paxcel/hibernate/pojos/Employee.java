package net.paxcel.hibernate.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Employee extends AbstractEntity{ 
	
	private String name;
	
	@OneToMany(mappedBy = "employee", cascade=CascadeType.ALL, fetch=FetchType.LAZY)	
	private List<Address> addresses = new ArrayList<Address>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
