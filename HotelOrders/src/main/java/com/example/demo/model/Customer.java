package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3591791467935994808L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id;
	
	private String fullName;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "order" )
	 private Order order;

 	private OrderItem orderItem;

	@Override
		
	public String toString() {
		return "Customer [id=" + id + ", fullName=" + fullName + ", order=" + order + ", orderItem=" + orderItem + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fullName, id, order, orderItem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(fullName, other.fullName) && Objects.equals(id, other.id)
				&& Objects.equals(order, other.order) && Objects.equals(orderItem, other.orderItem);
	}

		  
	  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	  
}
