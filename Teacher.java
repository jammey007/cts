package com.sch.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	private String classTeacher;
	private String class1;
	private String class2;
	private String class3;
	private String subject;
	@Autowired
	private PersonDetails persondetails;
	private String tId=persondetails.getpId();
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getClass1() {
		return class1;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}
	public String getClass2() {
		return class2;
	}
	public void setClass2(String class2) {
		this.class2 = class2;
	}
	public String getClass3() {
		return class3;
	}
	public void setClass3(String class3) {
		this.class3 = class3;
	}
	public PersonDetails getPersondetails() {
		return persondetails;
	}
	public void setPersondetails(PersonDetails persondetails) {
		this.persondetails = persondetails;
	}
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	
}
