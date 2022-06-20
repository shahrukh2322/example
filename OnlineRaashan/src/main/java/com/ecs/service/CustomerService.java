package com.ecs.service;

import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.bean.CustomerRegistration;
import com.ecs.bean.LoginCustomer;
import com.ecs.dao.CustomerRepository;


@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerRepository repository;
	
	@Override
	public List<CustomerRegistration> getAllCustomer() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<CustomerRegistration> createCustomer(CustomerRegistration emp) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(emp);
		return null;
	}

	@Override
	public List<CustomerRegistration> removeCustomer(int empid) {
		// TODO Auto-generated method stub
		repository.deleteById(empid);
		return repository.findAll();
	}

	@Override
	public List<CustomerRegistration> updateCustomer(CustomerRegistration emp) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(emp);
		return repository.findAll();
	}

	@Override
	public CustomerRegistration findCustomerById(int empid) {
		// TODO Auto-generated method stub
		Iterator<CustomerRegistration> cust=repository.findAll().iterator();
		while(cust.hasNext()) {
			CustomerRegistration c=cust.next();
			if(c.getId()==empid) {
				return c;
			}
		}
		return null;
	}

	@Override
	public CustomerRegistration loginCustomer(LoginCustomer lgc) {
		System.out.println("Inside Login Service");
		System.out.println(lgc.getEmmb()+"  "+lgc.getPass());
		for(CustomerRegistration c:repository.findAll()) {
			System.out.println("Reached for...");
			System.out.println(c.getEmail()+" "+c.getPass());
			if(c.getEmail()==null || c.getPass()==null ||c.getMbno()==null) {
				c.setEmail("");
				c.setPass("");
				c.setMbno("");
			}
			if((c.getEmail().compareTo(lgc.getEmmb())==0  || c.getMbno().compareTo(lgc.getEmmb())==0    )&& c.getPass().compareTo(lgc.getPass())==0) {
				System.out.println("Reaached if.... returning c");
				return c;
			}
		}
		System.out.println("Now I will return null");
		return null;
	}


}
