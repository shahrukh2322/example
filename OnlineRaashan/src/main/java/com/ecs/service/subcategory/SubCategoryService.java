package com.ecs.service.subcategory;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.bean.Category;
import com.ecs.bean.SubCategory;
import com.ecs.dao.CategoryRepository;
import com.ecs.dao.SubCategoryRepository;

@Service
public class SubCategoryService implements ISubCategoryService {

	@Autowired
	SubCategoryRepository srepo;
	@Autowired
	CategoryRepository carepo;
	
	@Override
	public List<SubCategory> getAllSubCategories() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}

	@Override
	public SubCategory addSubCategory(SubCategory scat) {
		// TODO Auto-generated method stub
		return srepo.saveAndFlush(scat);
	}

	@Override
	public SubCategory findCategoryById(int id) {
		// TODO Auto-generated method stub
		Optional<SubCategory> op=srepo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}

	@Override
	public SubCategory deleteCategoryById(int id) {
		// TODO Auto-generated method stub
		srepo.deleteById(id);
		return null;
	}

	@Override
	public List<SubCategory> fromCategoryName(String name) {
		// TODO Auto-generated method stub
		for(Category c:carepo.findAll()) {
			if(c.getCategory_name().equals(name)) {
				return c.getSubcat();
			}
		}
		return null;
	}

}
