package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;

@Service
public class OrderService { // Spring Beans//ServiceLayer
	public String createOrder(Order order) {
		return "Order Created";
	}
	public List<Order> getOrders() {
		return new ArrayList<Order>();
	}
	public void updateOrder(int orderId) {
		
	}
	public void deleteOrder(int orderId) {
		System.out.println("Order Deleted");
	}
	public Order getOrder(int orderId) {
		return new Order();
	}
}
