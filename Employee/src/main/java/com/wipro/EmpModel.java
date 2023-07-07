package com.wipro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmpModel {
	
	@Id
	private int userid;
	private String test;
	private String date;
	
	public EmpModel(int userid, String test, String date) {
		super();
		this.userid = userid;
		this.test = test;
		this.date = date;
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

	public EmpModel() {
		super();
	}

	

}
