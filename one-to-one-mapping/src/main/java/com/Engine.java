package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
	@Id
	private int Id;
	private String type;
	private int cc;
	
	public int getEngId() {
		return Id;
	}
	public void setEngId(int engId) {
		this.Id = engId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	

}
