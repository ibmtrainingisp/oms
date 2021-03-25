package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {	//frontend
	@Autowired	//is used for Dependency Injection-call the dependency service in a dependent controller
	OrderService orderService;
	@PostMapping("/order")
	String createOrder(@RequestBody @Valid Order order,BindingResult bindingResult ) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Something went wrong.Please retry!");
		}
		System.out.println(order);
		return orderService.createOrder(order); 
		//return "Success! Order created";
	}
	@GetMapping("/order")
	String SearchOrder(@RequestBody Order order) {	
		System.out.println(order);
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
