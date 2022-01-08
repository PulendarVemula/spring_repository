package com.createiq.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_02")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SID")
	private Integer sid;
	@Column(name = "SNAME")
	private String sname;
	@Column(name = "SADDRESS")
	private String saddress;
	
public Student() {
	// TODO Auto-generated constructor stub
}

public Student(Integer sid, String sname, String saddress) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.saddress = saddress;
}

public Integer getSid() {
	return sid;
}

public void setSid(Integer sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getSaddress() {
	return saddress;
}

public void setSaddress(String saddress) {
	this.saddress = saddress;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
}


}
