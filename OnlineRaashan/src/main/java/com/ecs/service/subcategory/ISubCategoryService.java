package com.ecs.service.subcategory;

import java.util.List;

import com.ecs.bean.SubCategory;

public interface ISubCategoryService {
	
	public List<SubCategory> getAllSubCategories();
	public SubCategory addSubCategory(SubCategory scat);
	public SubCategory findCategoryById(int id);
	public SubCategory deleteCategoryById(int id);
	public List<SubCategory> fromCategoryName(String name);

}
