package com.sch.model;

import org.springframework.stereotype.Component;

@Component

public class School {
	private String schId;
	private String schName;
	private String schAddress;
	public String getSchId() {
		return schId;
	}
	public void setSchId(String schId) {
		this.schId = schId;
	}
	public String getSchName() {
		return schName;
	}
	public void setSchName(String schName) {
		this.schName = schName;
	}
	public String getSchAddress() {
		return schAddress;
	}
	public void setSchAddress(String schAddress) {
		this.schAddress = schAddress;
	}
	
	
}
