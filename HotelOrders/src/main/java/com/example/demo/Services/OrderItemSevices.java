package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.OrderItem;

@Service
public interface OrderItemSevices {

	
	
	
	public List<OrderItem> orderItemsList ();
	public OrderItem saveOrderItem(OrderItem orderItem);
	public OrderItem  updateOrderItem(OrderItem orderItem);
	public String deleteOrderItem(OrderItem orderItem);

}
