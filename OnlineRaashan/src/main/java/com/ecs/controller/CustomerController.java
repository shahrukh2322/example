package com.ecs.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ecs.bean.CustomerRegistration;
import com.ecs.bean.LoginCustomer;
import com.ecs.exception.UserNotFoundException;
import com.ecs.service.ICustomerService;




//@CrossOrigin(origins="https://n-nvxm5eqs5rr4sqqhlelnuupzuly5tksxeq232si-0lu-script.googleusercontent.com")

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	ICustomerService ics;
	
	@GetMapping
	public List<CustomerRegistration> getAll(){
		return ics.getAllCustomer();
	}
	
	@PostMapping
	public ResponseEntity<CustomerRegistration> createCustomer(@Valid @RequestBody CustomerRegistration emp){
		
		
		ics.createCustomer(emp);
		int last=ics.getAllCustomer().size()-1;
		CustomerRegistration cc=ics.getAllCustomer().get(last);
		System.out.println("Hioiiiii "+cc.getId());
		System.out.println(emp);
		URI location=ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(cc.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	
	@GetMapping("/remove/{empid}")
	public List<CustomerRegistration> removeCustomer(@PathVariable int empid){
		return ics.removeCustomer(empid);
	}
	
	@PostMapping("/update")
	public List<CustomerRegistration> updateCustomer(@RequestBody CustomerRegistration emp)
	{
		return ics.updateCustomer(emp);
	}
	
	@GetMapping("/{empid}")
	public CustomerRegistration findCustomerById(@PathVariable int empid) {
		CustomerRegistration cust=ics.findCustomerById(empid);
		if(cust==null) {
			throw new UserNotFoundException("User not found by id- "+empid);
		}
		return cust;
	}
	
	@PostMapping("/login")
	public CustomerRegistration loginCustomer(@RequestBody LoginCustomer lgc) {
		System.out.println(lgc.getEmmb()+" "+lgc.getPass());
		
		
		return ics.loginCustomer(lgc);
	}
	

}
