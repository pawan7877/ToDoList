package com.example.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TodoNote {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sno;
	
	private String email;
	private String title;
	public TodoNote() {
		super();
	}
	public TodoNote(int sno, String email, String title) {
		super();
		this.sno = sno;
		this.email = email;
		this.title = title;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "TodoNote [sno=" + sno + ", email=" + email + ", title=" + title + "]";
	}
		
	
}
