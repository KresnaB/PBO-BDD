package com.gojek.gofood.model;

public class Merchant {
	private String name;
	private float distance;
	
	public Merchant (String name) {
		this.name = name;
		this.distance = 0;
	}
	
	public String getName() {
		return name;
	}
  
	public void setName(String name) {
		this.name = name;
	}
  
	public float getDistance() {
		return distance;
	}
  
	public void setDistance(float distance) {
		this.distance = distance;
	}
}