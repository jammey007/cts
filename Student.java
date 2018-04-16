package com.sch.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	private PersonDetails persondetails;
	private String sId=persondetails.getpId();
	private ClassDetails classdetails;
	private String classes=classdetails.getClasses();
	private Group group;
	private String gId=group.getgId();
	public PersonDetails getPersondetails() {
		return persondetails;
	}
	public void setPersondetails(PersonDetails persondetails) {
		this.persondetails = persondetails;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public ClassDetails getClassdetails() {
		return classdetails;
	}
	public void setClassdetails(ClassDetails classdetails) {
		this.classdetails = classdetails;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
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
