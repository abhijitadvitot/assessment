package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Services.CustomerServices;
import com.example.demo.model.Customer;


public class CustomerServiceImp implements CustomerServices {

	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public List<Customer> customersList() {
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public String deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
		return "Delete Cusotmer";
	}

}
