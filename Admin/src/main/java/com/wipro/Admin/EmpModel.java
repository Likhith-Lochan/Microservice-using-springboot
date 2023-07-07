package com.wipro.Admin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmpModel {
	
	@Id
	private int userid;
	private String test;
	private String date;
	private String type;
	
	public EmpModel(int userid, String test, String date,String type) {
		super();
		this.userid = userid;
		this.test = test;
		this.date = date;
		this.type=type;
	}
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public EmpModel() {
		super();
	}

	

}
