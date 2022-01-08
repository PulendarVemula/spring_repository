package com.createiq.ems.model;

public class Address {

	private Integer aid;
	private String alocation;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(Integer aid, String alocation) {
		super();
		this.aid = aid;
		this.alocation = alocation;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAlocation() {
		return alocation;
	}

	public void setAlocation(String alocation) {
		this.alocation = alocation;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", alocation=" + alocation + "]";
	}
	
	
}
