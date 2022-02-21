package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order" )
public class Order  implements Serializable

{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6560329914946192668L;
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 
     private Long totalPrice;
	 private String created,status,shipmentAddress,shipDate;
	 
	 
	 private Customer customer;
	 
	 
	 
	 private OrderItem orderItem;

	 
	 
	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getShipmentAddress() {
		return shipmentAddress;
	}

	public void setShipmentAddress(String shipmentAddress) {
		this.shipmentAddress = shipmentAddress;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(created, customer, id, orderItem, shipDate, shipmentAddress, status, totalPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(created, other.created) && Objects.equals(customer, other.customer)
				&& Objects.equals(id, other.id) && Objects.equals(orderItem, other.orderItem)
				&& Objects.equals(shipDate, other.shipDate) && Objects.equals(shipmentAddress, other.shipmentAddress)
				&& Objects.equals(status, other.status) && Objects.equals(totalPrice, other.totalPrice);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", totalPrice=" + totalPrice + ", created=" + created + ", status=" + status
				+ ", shipmentAddress=" + shipmentAddress + ", shipDate=" + shipDate + ", customer=" + customer
				+ ", orderItem=" + orderItem + "]";
	}
	 
	
	
	
}
