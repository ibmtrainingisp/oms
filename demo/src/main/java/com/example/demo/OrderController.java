package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@PostMapping("/order")
	String createOrder() {
		return "Sucess! Order created";
	}
	@GetMapping("/order")
	String SearchOrder() {	//getorder
		return "Order retrieved";
	}
	@PutMapping("/order/{id}")
	String UpdateOrder(@PathVariable("id") int orderId) {	
		System.out.println(orderId);
		return "Order updated";
	}
	@DeleteMapping("/order/{id}")
	String DeleteOrder(@PathVariable("id") int orderId) {	
		System.out.println(orderId);
		return "Order deleted";
	}
}
