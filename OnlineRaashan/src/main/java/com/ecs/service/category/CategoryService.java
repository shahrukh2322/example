package com.ecs.service.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.bean.Category;
import com.ecs.dao.CategoryRepository;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	CategoryRepository crep;

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return crep.findAll();
	}

	@Override
	public Category addCategory(Category c) {
		// TODO Auto-generated method stub
		return crep.saveAndFlush(c);
	}
	
	

}
