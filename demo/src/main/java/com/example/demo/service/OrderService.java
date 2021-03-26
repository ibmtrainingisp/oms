package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repo.OrderRepository;

@Service
public class OrderService { // Spring Beans//ServiceLayer
	@Autowired	// is used for Dependency Injection-call the dependency repository in a dependent service
	OrderRepository orderRepository;
	public String createOrder(Order order) {
		Order savedOrder=orderRepository.save(order);
		return savedOrder.getId();
		//return "Order Created";
	}
	public List<Order> getOrders() {
		return new ArrayList<Order>();
	}
	public Order getOrder(int orderId) {
		return new Order();
	}
	public void updateOrder(int orderId) {
		
	}
	public void deleteOrder(int orderId) {
		System.out.println("Order Deleted");
	}
}
