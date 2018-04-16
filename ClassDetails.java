package com.sch.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ClassDetails {
	private String classes;
	private String s1Id;
	private String s2Id;
	private String s3Id;
	private String s4Id;
	private String s5Id;
	@Autowired
	private PersonDetails persondetails;
	private String tId=persondetails.getpId();
	private Group group;
	private String gId=group.getgId();
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public String getS1Id() {
		return s1Id;
	}
	public void setS1Id(String s1Id) {
		this.s1Id = s1Id;
	}
	public String getS2Id() {
		return s2Id;
	}
	public void setS2Id(String s2Id) {
		this.s2Id = s2Id;
	}
	public String getS3Id() {
		return s3Id;
	}
	public void setS3Id(String s3Id) {
		this.s3Id = s3Id;
	}
	public String getS4Id() {
		return s4Id;
	}
	public void setS4Id(String s4Id) {
		this.s4Id = s4Id;
	}
	public String getS5Id() {
		return s5Id;
	}
	public void setS5Id(String s5Id) {
		this.s5Id = s5Id;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public String getgId() {
		return gId;
	}
	public void setgId(String gId) {
		this.gId = gId;
	}
	
	
}
