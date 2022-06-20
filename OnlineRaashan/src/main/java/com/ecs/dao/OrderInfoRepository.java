package com.ecs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecs.bean.OrderInfo;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Integer> {

}
