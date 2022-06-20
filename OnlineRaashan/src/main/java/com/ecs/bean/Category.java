package com.ecs.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String category_name;
	
	@OneToMany(mappedBy = "category")
	private List<SubCategory> subcat;
	public Category() {
		// TODO Auto-generated constructor stub
	}
	public Category(int id, String category_name) {
		super();
		this.id = id;
		this.category_name = category_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	public List<SubCategory> getSubcat() {
		return subcat;
	}
	public void setSubcat(List<SubCategory> subcat) {
		this.subcat = subcat;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", category_name=" + category_name + "]";
	}
	
	

}
