package com.ecs.service.orderinfo;

import java.util.List;

import com.ecs.bean.OrderInfo;

public interface IOrderInfoService {
	
	public List<OrderInfo> getAllOrders();
	public OrderInfo addOrderInfo(OrderInfo order);
	public OrderInfo getOrderById(int id);
	public void deleteOrderById(int id);

}
