package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
	@Id
	private int pId;
	private String pname;
	private double pprice;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	
	

}
