package com.ecs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecs.bean.Category;
import com.ecs.service.category.CategoryService;


@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
	
	@Autowired
	CategoryService cservice;
	

	
	@GetMapping
	public ResponseEntity<List<Category>> getAllCategories(){
		return ResponseEntity.status(HttpStatus.OK).body(cservice.getAllCategories());
	}
	
	@PostMapping
	public Category addCategory(Category c){
		return cservice.addCategory(c);
	}
	
	
	

}
