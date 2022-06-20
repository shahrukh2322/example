package com.ecs.service;

import java.util.List;

import com.ecs.bean.CustomerRegistration;
import com.ecs.bean.LoginCustomer;

public interface ICustomerService {
	
	public List<CustomerRegistration> getAllCustomer();
	public List<CustomerRegistration> createCustomer(CustomerRegistration emp);
	public List<CustomerRegistration> removeCustomer(int empid);
	public List<CustomerRegistration> updateCustomer(CustomerRegistration emp);
	public CustomerRegistration findCustomerById(int empid);
	public CustomerRegistration loginCustomer(LoginCustomer lgc) ;	
	
}
