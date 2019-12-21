package com.gojek.gofood.model;

public class Products {
	
	private String name;
	private int rating;
	private Merchant Merchant;
	
	public Products(String name) {
		this.name = name;
		this.rating = 0;
		this.Merchant = Merchant;
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

	public Merchant getMerchant() {
		return Merchant;
	}

	public void setMerchant(Merchant merchant) {
		Merchant = merchant;
	}
	
	public float getDistance() {
		return Merchant != null ? Merchant.getDistance() : null;
	}
	
	public void setDistance(float distance) {
		Merchant.setDistance(distance);
	}
	
}
