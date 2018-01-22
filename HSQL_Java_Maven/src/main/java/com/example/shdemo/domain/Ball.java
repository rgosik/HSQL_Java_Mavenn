package com.example.shdemo.domain;

public class Ball {
	
	int id;	
	String name;
	double price;
	public int tax;
	public String type;
	
	
	public Ball(String name, double price, int tax, String type){
		this.name = name;
		this.price = price;
		this.tax = tax;
		this.type = type;
	};
	
	public Ball(){};
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

