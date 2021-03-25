package com.example.demo.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Order {
	@NotNull	//included valid dependency in pom.xml
	private String item;
	private float price;
	@NotNull
	private int id;	//TO DO
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price<=0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
