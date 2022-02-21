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
import com.example.demo.ServiceImp.OrderItemServiceImp;
import com.example.demo.ServiceImp.OrderServiceImp;
import com.example.demo.model.Customer;
import com.example.demo.model.Order;

@RestController
@RequestMapping("Order")
public class OrderController {

	
	
	 @Autowired
	 private OrderServiceImp orderServiceImp;
	 
	 
	 @GetMapping("/all")
	 public List<Order> ordersList(@RequestBody Order  Order)
	 {
		 return orderServiceImp.orderList();
		 
	 }
	 @PostMapping("/save")
	 public Order saveOrder (@RequestBody Order order)
	 {
		 return orderServiceImp.saveOrder(order);
		 
		 
	 }@PutMapping("/update")
	 public Order updateOrder(@RequestBody Order order)
	 {
		 return orderServiceImp.updateOrder(order);
		 
		 
	 } 
	 @DeleteMapping("/update")
	 public String deleteOrder(@RequestBody Order order )
	 {
		  orderServiceImp.deleteOrder(order);
		  return "DeleteOrder";
		 
	 } 

}
