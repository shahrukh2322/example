package com.ecs.service.orderinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.bean.OrderInfo;
import com.ecs.dao.OrderInfoRepository;

@Service
public class OrderInfoService implements IOrderInfoService {

	@Autowired
	OrderInfoRepository oirepo;
	
	@Override
	public List<OrderInfo> getAllOrders() {
		// TODO Auto-generated method stub
		return oirepo.findAll();
	}

	@Override
	public OrderInfo addOrderInfo(OrderInfo order) {
		// TODO Auto-generated method stub
		return oirepo.saveAndFlush(order);
	}

	@Override
	public OrderInfo getOrderById(int id) {
		// TODO Auto-generated method stub
		return oirepo.findById(id).get();
	}

	@Override
	public void deleteOrderById(int id) {
		// TODO Auto-generated method stub
		oirepo.deleteById(id);
		
	}

}
