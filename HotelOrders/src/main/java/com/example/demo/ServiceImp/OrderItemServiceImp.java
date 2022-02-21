package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.OrderItemRepository;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.Services.OrderItemSevices;
import com.example.demo.model.OrderItem;

public class OrderItemServiceImp implements OrderItemSevices {

	
	@Autowired
	 
	 private OrderItemRepository orderItemRepository;
	
	
	 
	@Override
	public List<OrderItem> orderItemsList() {
		return orderItemRepository.findAll();
	}

	@Override
	public OrderItem saveOrderItem(OrderItem orderItem) {
		 
		return orderItemRepository.save(orderItem);
	}

	@Override
	public OrderItem updateOrderItem(OrderItem orderItem) {
		
		return orderItemRepository.save(orderItem) ;
	}

	@Override
	public String deleteOrderItem(OrderItem orderItem) {

		orderItemRepository.delete(orderItem);
		return "Delete OrderItem";
	}

}
