package com.ecs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecs.bean.CustomerRegistration;

public interface CustomerRepository extends JpaRepository<CustomerRegistration,Integer> {

}
