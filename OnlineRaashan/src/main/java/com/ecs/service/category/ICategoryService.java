package com.ecs.service.category;

import java.util.List;

import com.ecs.bean.Category;

public interface ICategoryService {
	
	public List<Category> getAllCategories();
	public Category addCategory(Category c);

}
