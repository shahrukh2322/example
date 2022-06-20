package com.ecs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecs.bean.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
