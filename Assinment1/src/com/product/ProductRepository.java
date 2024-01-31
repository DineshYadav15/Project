package com.product;

public class ProductRepository
{
	private int id;
    private String name;
    private double price;
    
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void display()
	{
		System.out.println("id     : " + id);
		System.out.println("Name   : " + name);
		System.out.println("price  : " + price);
	}


	@Override
	public String toString() {
		return "ProductRepository [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	
		
	
}
