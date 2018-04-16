package com.sch.model;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PersonDetails {
	private String pId;
	private String pName;
	private Date dob;
	private String password;
	private String caste;
	private String religion;
	private String nationality;
	private String gender;
	private long cNo;
	@Autowired
	private School school;
	private Address address;
	private AssociateType associatetype;
	private String schId=school.getSchId();
	private String aId=address.getaId();
	private String assId=associatetype.getAssId();
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getcNo() {
		return cNo;
	}
	public void setcNo(long cNo) {
		this.cNo = cNo;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public AssociateType getAssociatetype() {
		return associatetype;
	}
	public void setAssociatetype(AssociateType associatetype) {
		this.associatetype = associatetype;
	}
	public String getSchId() {
		return schId;
	}
	public void setSchId(String schId) {
		this.schId = schId;
	}
	public String getaId() {
		return aId;
	}
	public void setaId(String aId) {
		this.aId = aId;
	}
	public String getAssId() {
		return assId;
	}
	public void setAssId(String assId) {
		this.assId = assId;
	}
	
	
	
}
