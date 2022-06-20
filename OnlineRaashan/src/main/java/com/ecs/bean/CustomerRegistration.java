package com.ecs.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
public class CustomerRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Size(min=2,message = "Name should have atleast 2 characters")
	private String name;
	@Email(regexp="^(.+)@(.+)$",message = "Should be valid email")
	private String email;
	@Pattern(regexp="^[6-9][0-9]{9}$",message = "Number should be 10 digit starting with 6 to 9")
	private String mbno;
	private String pass;
	
	@OneToMany(mappedBy = "cust")
	private List<OrderInfo> oinfo;
	
	public List<OrderInfo> getOinfo() {
		return oinfo;
	}
	public void setOinfo(List<OrderInfo> oinfo) {
		this.oinfo = oinfo;
	}
	public CustomerRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerRegistration(int id, String name, String email, String mbno, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mbno = mbno;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMbno() {
		return mbno;
	}
	public void setMbno(String mbno) {
		this.mbno = mbno;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

	@Override
	public String toString() {
		return "CustomerRegistration [id=" + id + ", name=" + name + ", email=" + email + ", mbno=" + mbno + ", pass="
				+ pass + "]";
	}
	

}
