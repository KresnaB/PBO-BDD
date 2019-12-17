package com.gojek.gofood.model;

public class Products {
	
	private String name;
	private int rating;
	
	public Products(String name, int rating, float distance) {
		this.name = name;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
