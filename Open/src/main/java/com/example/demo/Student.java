package com.example.demo;

import java.util.Date;

public class Student {
	private int seq;
	private String itemname;
	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	private String stdnum;
	private String name;
	private String phonenum;
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

	@Override
	public String toString() {
		return "Student [seq=" + seq + ", itemname=" + itemname + ", stdnum=" + stdnum + ", name=" + name
				+ ", phonenum=" + phonenum + ", date=" + date + "]";
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getStdnum() {
		return stdnum;
	}

	public void setStdnum(String stdnum) {
		this.stdnum = stdnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
}
