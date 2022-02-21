package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.CustomerServiceImp;
import com.example.demo.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	 @Autowired
	 private CustomerServiceImp customerServiceImp;
	 
 	 
	 @GetMapping("/all")
	 public List<Customer> customersList(@RequestBody Customer customer)
	 {
		 return customerServiceImp.customersList();
		 
	 }
	 @PostMapping("/save")
	 public Customer saveCustomer (@RequestBody Customer customer)
	 {
		 return customerServiceImp.saveCustomer(customer);
		 
		 
	 }@PutMapping("/update")
	 public Customer updateaCustomer(@RequestBody Customer customer)
	 {
		 return customerServiceImp.updateCustomer(customer);
		 
		 
	 } 
	 @DeleteMapping("/update")
	 public String deleteCustomer(@RequestBody Customer customer)
	 {
		  customerServiceImp.deleteCustomer(customer);
		  return "DeleteCumotmerServie";
		 
	 } 
	
}
