package net.hb.day16;

import java.util.Vector; //Calendar, Date, Arrays, Random

public class GuestBean {	//bean=DTO=다리역할 (.jsp .java
	private String name;//필드
	private String title;
	private int sabun;
	private char grade;
	private java.util.Date nalja;
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public java.util.Date getNalja() {
		return nalja;
	}
	public void setNalja(java.util.Date nalja) {
		this.nalja = nalja;
	}
	

}
