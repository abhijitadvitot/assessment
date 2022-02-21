package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;

@Service
public interface CustomerServices {

	
	public List<Customer> customersList ();
	public Customer saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer );
	public String deleteCustomer(Customer customer);
	
}
