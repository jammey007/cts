package com.sch.model;

import org.springframework.stereotype.Component;

@Component
public class AssociateType {
	private String assId;
	private String desgnation;
	public String getAssId() {
		return assId;
	}
	public void setAssId(String assId) {
		this.assId = assId;
	}
	public String getDesgnation() {
		return desgnation;
	}
	public void setDesgnation(String desgnation) {
		this.desgnation = desgnation;
	}
	
}
