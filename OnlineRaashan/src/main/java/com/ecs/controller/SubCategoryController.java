package com.ecs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecs.bean.SubCategory;
import com.ecs.service.subcategory.SubCategoryService;

@RestController
@RequestMapping("category/sub-category")
@CrossOrigin(origins = "http://localhost:4200")
public class SubCategoryController {
	
	@Autowired
	SubCategoryService sservice;
	
	@GetMapping
	public List<SubCategory> getAllSubCategories(){
		return sservice.getAllSubCategories();
	}
	
	@PostMapping
	public SubCategory addSubCategory(SubCategory c){
		return sservice.addSubCategory(c);
	}
	
	@GetMapping("/find/{id}")
	public SubCategory getCategoryById(int id) {
		return sservice.findCategoryById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCategoryById(@PathVariable int id) {
		sservice.deleteCategoryById(id);
	}
	
	@PostMapping("/by-name/")
	public List<SubCategory> getByCategoryName(@RequestBody String name){
		return sservice.fromCategoryName(name);
	}
	
}
