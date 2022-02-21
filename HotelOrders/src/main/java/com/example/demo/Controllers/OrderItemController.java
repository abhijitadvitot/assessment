package com.example.demo.Controllers;

import java.util.List;

import javax.persistence.Access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.OrderItemServiceImp;
import com.example.demo.model.Order;
import com.example.demo.model.OrderItem;

@RestController
@RequestMapping("/orderitem")
public class OrderItemController {

	@Autowired
	private OrderItemServiceImp orderItemServiceImp;
	 
	 @GetMapping("/all")
	 public List<OrderItem> orderItemsList(@RequestBody OrderItem orderItem)
	 {
		 return orderItemServiceImp.orderItemsList();
		 
	 }
	 @PostMapping("/save")
	 public OrderItem saveOrderItem (@RequestBody OrderItem orderItem)
	 {
		 return orderItemServiceImp.saveOrderItem(orderItem);
		 
		 
	 }@PutMapping("/update")
	 public OrderItem updateOrderItem(@RequestBody OrderItem orderItem)
	 {
		 return orderItemServiceImp.updateOrderItem(orderItem);
		 
		 
	 } 
	 @DeleteMapping("/update")
	 public String deleteOrderItem(@RequestBody OrderItem orderItem )
	 {
		  orderItemServiceImp.deleteOrderItem(orderItem);
		  return "DeleteOrder";
		 
	 } 
	
	
	
}
