package com.gojek.gofood.model;

public class Driver {
	private String name;
	private float distance;
	private float rating;
	
	public Driver(String name) {
		this.name = name;
		distance = 0;
	}
	
	public String getName() {return name;}
	public void setName(String newName) { name = newName; }
	public float getDistance() { return distance;}
	public void setDistance(float newDistance) { distance = newDistance; }
	public float getRating() { return rating;}
	public void setRating(float newDistance) { rating = newDistance; } 
}
