package com.boot.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int srno;
	private int sid;
	private String sname;
	private String saddress;
	private float avg;
	
	private String grade;

	public int getSid() {
		return sid;
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public void setSid(int sid) {
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

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "StudentDTO [srno=" + srno + ", sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", avg="
				+ avg + ", grade=" + grade + "]";
	}

	
	
}
