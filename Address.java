package com.sch.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String aId;
	private String adL1;
	private String adL2;
	private String city;
	private String state;
	private long pinCode;
	public String getaId() {
		return aId;
	}
	public void setaId(String aId) {
		this.aId = aId;
	}
	public String getAdL1() {
		return adL1;
	}
	public void setAdL1(String adL1) {
		this.adL1 = adL1;
	}
	public String getAdL2() {
		return adL2;
	}
	public void setAdL2(String adL2) {
		this.adL2 = adL2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
}
