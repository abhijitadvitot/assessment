package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Order;

@Service
public interface OrderServices {

	
	public List<Order> orderList ();
	public Order saveOrder(Order order);
	public Order updateOrder(Order order );
	public String deleteOrder(Order order);

}
