package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class shop {
	@Id
	private int sId;
	private String sname;
	private String address;
	
	@OneToMany
	private List<product> products;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<product> getProducts() {
		return products;
	}

	public void setProducts(List<product> products) {
		this.products = products;
	}
}
