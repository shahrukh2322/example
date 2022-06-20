package com.ecs.bean;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OrderInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private CustomerRegistration cust;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private SubCategory subcat;
	
	private String googleAddress;
	private int finalAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@JsonIgnore
	public CustomerRegistration getCust() {
		return cust;
	}
	
	public void setCust(CustomerRegistration cust) {
		this.cust = cust;
	}
	
	@JsonIgnore
	public SubCategory getSubcat() {
		return subcat;
	}
	
	public void setSubcat(SubCategory subcat) {
		this.subcat = subcat;
	}

	public int getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(int finalAmount) {
		this.finalAmount = finalAmount;
	}
	
	public String getGoogleAddress() {
		return googleAddress;
	}

	public void setGoogleAddress(String googleAddress) {
		this.googleAddress = googleAddress;
	}

	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", finalAmount=" + finalAmount + "]";
	}
	
	
}
