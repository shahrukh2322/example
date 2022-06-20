package com.ecs.bean;

import org.springframework.stereotype.Component;

@Component
public class LoginCustomer {

	private String emmb;
	private String pass;
	public LoginCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginCustomer(String emmb, String pass) {
		super();
		this.emmb = emmb;
		this.pass = pass;
	}
	public String getEmmb() {
		return emmb;
	}
	public void setEmmb(String emmb) {
		this.emmb = emmb;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
