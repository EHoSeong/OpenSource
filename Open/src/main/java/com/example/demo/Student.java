package com.example.demo;

public class Student {
	private int seq;
	private String stdnum;
	private String name;
	private String phonenum;

	@Override
	public String toString() {
		return "Student [seq=" + seq + ", stdnum=" + stdnum + ", name=" + name + ", phonenum=" + phonenum + "]";
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
