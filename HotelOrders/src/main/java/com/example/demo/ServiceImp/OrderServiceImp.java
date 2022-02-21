package com.example.demo.ServiceImp;

import java.util.List;

import com.example.demo.Repository.OrderRepository;
import com.example.demo.Services.OrderServices;
import com.example.demo.model.Order;

public class OrderServiceImp implements OrderServices  {

   private OrderRepository orderRepository;
   
	@Override
	public List<Order> orderList() {

		return orderRepository.findAll();
	}

	@Override
	public Order saveOrder(Order order) {

		return orderRepository.save(order) ;
	}

	@Override
	public Order updateOrder(Order order) {
		
		return orderRepository.save(order);
	}

	@Override
	public String deleteOrder(Order order) {
	 orderRepository .delete(order);
		return "Delete Oder";
	}

}
