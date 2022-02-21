package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Order_item")
public class OrderItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4630815575964060191L;


private Long id;
private String product,quantity;

private Order order; 
private Customer customer;
@Override
public String toString() {
	return "OrderItem [id=" + id + ", product=" + product + ", quantity=" + quantity + ", order=" + order
			+ ", customer=" + customer + "]";
}
@Override
public int hashCode() {
	return Objects.hash(customer, id, order, product, quantity);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	OrderItem other = (OrderItem) obj;
	return Objects.equals(customer, other.customer) && Objects.equals(id, other.id)
			&& Objects.equals(order, other.order) && Objects.equals(product, other.product)
			&& Objects.equals(quantity, other.quantity);
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}


}
