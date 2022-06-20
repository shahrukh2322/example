package com.ecs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecs.bean.OrderInfo;
import com.ecs.service.orderinfo.IOrderInfoService;

@RestController
@RequestMapping("/orders")
public class OrderInfoController {
	
	@Autowired
	IOrderInfoService ioiser;
	
	@GetMapping
	public List<OrderInfo> getAllOrders(){
		return ioiser.getAllOrders();
	}
	
	@PostMapping
	public OrderInfo addOrderInfo(@RequestBody OrderInfo order) {
		return ioiser.addOrderInfo(order);
	}
	
	@GetMapping("/{id}")
	public OrderInfo getOrderById(@PathVariable int id) {
		return ioiser.getOrderById(id);
	}
	public void deleteOrderById(int id) {
		ioiser.deleteOrderById(id);
	}

	

}
