package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;

@Service
public class OrderService { // Spring Beans//ServiceLayer
	public String createOrder(Order order) {
		return "Order Created";
	}
}
